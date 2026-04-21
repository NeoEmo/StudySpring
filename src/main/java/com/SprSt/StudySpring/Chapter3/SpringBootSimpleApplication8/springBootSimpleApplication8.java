package com.SprSt.StudySpring.Chapter3.SpringBootSimpleApplication8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
public class springBootSimpleApplication8 {

    private static final Logger log = LoggerFactory.getLogger(springBootSimpleApplication8.class);

    public static void main(String[] args) throws IOException {
        SpringApplication.run(springBootSimpleApplication8.class, args);
    }

    @Bean
    String info() {
        return "Just a simple String bean";
    }

    @Autowired
    String info;

    @Bean
    CommandLineRunner myMethod() {
        return args -> {
            log.info("## > CommandLineRunner Implementation...");
            log.info("Accessing the info bean " + info);
            for (String arg : args) {
                log.info(arg);
            }
        };
    }
}
