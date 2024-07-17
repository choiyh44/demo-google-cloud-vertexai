package com.example.demogooglecloudvertexai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@ConfigurationPropertiesScan
public class DemoGoogleCloudVertexaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGoogleCloudVertexaiApplication.class, args);
	}

}
