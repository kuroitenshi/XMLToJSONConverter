package com.converter.XMLToJSONConverter;

import com.converter.XMLToJSONConverter.properties.StorageProperties;
import com.converter.XMLToJSONConverter.service.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class XmlToJsonConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlToJsonConverterApplication.class, args);
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}
}
