package com.SprSt.StudySpring.Chapter3.SpringBootSimpleApplication4;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class springBootSimpleApplication4 {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(springBootSimpleApplication4.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
