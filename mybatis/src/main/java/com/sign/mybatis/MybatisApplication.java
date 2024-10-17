package com.sign.mybatis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MybatisApplication {
    @Autowired
    private String words = "cebtech"

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        hello(this.words);
    }

    public void hello(String words){
        log.info("Hello " + words + " !!!")
    }

}
