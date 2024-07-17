package com.example.demogooglecloudvertexai.common.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationProperties(prefix = "google.vertaxai")
@Data
public class VertaxAiConfig {
    private String projectId;
    private String location;
    private String modelName;
}
