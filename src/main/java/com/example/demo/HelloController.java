
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "App is running on Java 21 Spring Boot!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Java 21!";
    }
}

