package com.gcauth.gcauth.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.gcauth.gcauth.service.MyUserDetailService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Autowired
    private MyUserDetailService userDetailService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(registry -> {
                    registry.requestMatchers("/home", "/register/**").permitAll();
                    registry.requestMatchers("/admin/**").hasRole("ADMIN");
                    registry.requestMatchers("/user/**").hasRole("USER");
                    registry.anyRequest().authenticated();
                })
                .formLogin(AbstractAuthenticationFilterConfigurer::permitAll)
                // .formLogin(httpSecurityFormLoginConfigurer -> {
                // httpSecurityFormLoginConfigurer
                // .loginPage("/login")
                // .successHandler(new AuthenticationSuccessHandler())
                // .permitAll();
                // })

                .build();
    }

    // https://bcrypt-generator.com/

    // @Bean
    // public UserDetailsService userDetailsService() {
    // UserDetails normalUser = User.builder()
    // .username("gcarnab")
    // .password("$2a$12$1R/2vuVcZ2eh1cvTx/HYuOBTkRXjJMBwUoRmWWEYmZsZ5ek2.mynO")
    // .roles("USER")
    // .build();
    // UserDetails adminUser = User.builder()
    // .username("admin")
    // .password("$2a$12$ZcjBNBNXlQ7X5ybIXv0ODOWD7GugdbUjsJbn8Cn3F7aIEaKEIX/fm")
    // .roles("ADMIN", "USER")
    // .build();
    // return new InMemoryUserDetailsManager(normalUser, adminUser);
    // }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return userDetailService;
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailService);
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }
}