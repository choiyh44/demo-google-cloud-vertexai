package com.example.demogooglecloudvertexai.common.util;

import com.google.cloud.vertexai.VertexAI;
import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.generativeai.ChatSession;
import com.google.cloud.vertexai.generativeai.GenerativeModel;
import com.google.cloud.vertexai.generativeai.ResponseHandler;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Component
public class VertaxAiUtil {
    @Autowired
    private VertaxAiConfig vertaxAiConfig;

//    public Boolean confirmDepositProtectionOfText(String text) {
//
//    }

    public GenerateContentResponse sendoMessageAndReceiveResponse(String message) throws IOException {
        try (VertexAI vertexAI = new VertexAI(vertaxAiConfig.getProjectId(), vertaxAiConfig.getLocation())) {
            GenerateContentResponse response;

            GenerativeModel model = new GenerativeModel(vertaxAiConfig.getModelName(), vertexAI);
            // Create a chat session to be used for interactive conversation.
            ChatSession chatSession = new ChatSession(model);

            response = chatSession.sendMessage(message);

            return response;
        }
    }
}
