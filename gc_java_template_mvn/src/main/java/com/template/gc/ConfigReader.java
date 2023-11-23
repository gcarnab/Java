package com.template.gc;

import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class ConfigReader {
    private XMLConfiguration config;

    public ConfigReader(String configFile) {
        try {
            Configurations configs = new Configurations();
            config = configs.xml(configFile);
        } catch (ConfigurationException e) {
            throw new RuntimeException("Error reading the configuration file.", e);
        }
    }

    public String getProperty1() {
        return config.getString("useLog");
    }

    public String getProperty2() {
        return config.getString("prop2");
    }
}
