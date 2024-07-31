package com.geunskoo.growtogether;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthChecker {

    @GetMapping("/health")
    public String healthChecker(){
        return "Hello World!";
    }
}
