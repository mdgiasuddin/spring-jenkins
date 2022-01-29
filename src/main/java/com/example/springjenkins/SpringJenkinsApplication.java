package com.example.springjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @PostConstruct
    public void logSomething() {
        log.info("Application started!");
        log.info("Welcome to jenkins!");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringJenkinsApplication.class, args);
    }

}
