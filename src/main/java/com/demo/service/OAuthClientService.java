package com.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class OAuthClientService {

    private final WebClient webClient;

    private final String path;

    public OAuthClientService(final WebClient webClient,
                              final @Value("${resource.path}") String path) {
        this.webClient = webClient;
        this.path = path;
    }

    public String getMessage() {
        return webClient.get().uri(path).retrieve().bodyToMono(String.class).block();
    }

}