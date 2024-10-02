package com.sign.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HellospringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellospringApplication.class, args);
    }

    @RequestMapping("/hellospring")
    public String hello() {
        return "Hello Spring Boot!";
    }

}
