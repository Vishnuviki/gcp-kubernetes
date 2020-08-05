package com.example.kubernetes.cloudkubernetes.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public String printHelloWorld() {
        return "HELLO WORLD";
    }
}
