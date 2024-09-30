package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo")
public class DemoController
{
    @GetMapping("/greet")
    public String index()
    {
        return "Greetings from Spring Boot!";
    }
}