package com.example.demogooglecloudvertexai.common.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "google.vertexai")
@Data
public class VertexAiConfig {
    private String projectId;
    private String location;
    private String modelName;
}
