package com.leo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String home() {
        return "welcome to LeoCrypto Trading Platform";
    }

    @GetMapping("/api")
    public String secure() {
        return "welcome to LeoCrypto Trading Platform Secure";
    }
}
