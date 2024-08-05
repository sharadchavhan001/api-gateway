package com.app.api_gateway.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/api-gateway")
    public String test() {
        return "API Gateway is working!";
    }
}
