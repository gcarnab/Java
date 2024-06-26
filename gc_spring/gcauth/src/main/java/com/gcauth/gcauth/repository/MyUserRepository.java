package com.gcauth.gcauth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcauth.gcauth.model.MyUser;

public interface MyUserRepository extends JpaRepository<MyUser, Long> {

    Optional<MyUser> findByUsername(String username);
}