package com.SprSt.StudySpring.Chapter4.ToDoClient.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;

import java.io.IOException;
import java.net.URI;

public class ToDoErrorHandler extends DefaultResponseErrorHandler {

    private Logger log = LoggerFactory.getLogger(ToDoErrorHandler.class);

    @Override
    public void handleError(URI url, HttpMethod method, ClientHttpResponse response) throws IOException {
        log.error(response.getStatusCode().toString());
        // Если хотите, можете также прочитать тело ответа:
        // String body = new String(getResponseBody(response), getCharset(response));
        // log.error(body);
        super.handleError(url, method, response);
    }
}
