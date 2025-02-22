package com.example.hellomark.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Handling GET request with query parameter
    @GetMapping("/api/hello/query")
    public String sayHello(@RequestParam(value = "name", defaultValue = "Guest") String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}

