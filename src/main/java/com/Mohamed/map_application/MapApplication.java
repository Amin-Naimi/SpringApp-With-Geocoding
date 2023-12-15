package com.Mohamed.map_application;

import com.Mohamed.map_application.configuration.OpenCagePropertiesConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(OpenCagePropertiesConfiguration.class)
public class MapApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapApplication.class, args);
	}

}
