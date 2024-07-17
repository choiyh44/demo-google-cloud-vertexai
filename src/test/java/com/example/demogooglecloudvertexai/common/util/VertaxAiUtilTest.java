package com.example.demogooglecloudvertexai.common.util;

import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.generativeai.ResponseHandler;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.readString;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class VertaxAiUtilTest {
    @Autowired
    private VertaxAiUtil VertaxAiUtil;

    @Test
    void sendoMessageAndReceiveResponse() throws IOException {
        String message = "다음 글에서 금융상품의 예금자보호 여부를 확인해줘.";
        String inputPath = "src/main/resources/sample.txt";
        String text = readString(Path.of(inputPath));

        GenerateContentResponse result = VertaxAiUtil.sendoMessageAndReceiveResponse(message + text);

        log.info("response text: {}", ResponseHandler.getText(result));

        assertNotNull(ResponseHandler.getText(result));
    }

    @Test
    void sendoMessageAndReceiveResponse_YesNo() throws IOException {
        String message = "다음 글에서 금융상품의 예금자보호 여부를 확인해줘. 보호되는 경우 Yes, 보호되지 않는 경우 No로 답변해줘.";
        String inputPath = "src/main/resources/sample.txt";
        String text = readString(Path.of(inputPath));

        GenerateContentResponse result = VertaxAiUtil.sendoMessageAndReceiveResponse(message + text);

        log.info("response text: {}", ResponseHandler.getText(result));

        assertNotNull(ResponseHandler.getText(result));
    }

}