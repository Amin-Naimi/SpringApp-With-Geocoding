package com.Mohamed.map_application.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "opencage")
@Getter
@Setter
public class OpenCagePropertiesConfiguration {
    private String apikey;
}
