package com.demo.controller;

import com.demo.service.OAuthClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apis/v1")
public class OAuthClientController {

    @Autowired
    private OAuthClientService service;


    @GetMapping("/test")
    public String getMessage() {
        return service.getMessage();
    }

}