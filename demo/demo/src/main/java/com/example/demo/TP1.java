package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TP1 {
    public static void main(String[] args) {
        SpringApplication.run(TP1.class, args);
    }

    @GetMapping("/bonjour")
    public String hello() {
        return"Hello World!";
    }
}
