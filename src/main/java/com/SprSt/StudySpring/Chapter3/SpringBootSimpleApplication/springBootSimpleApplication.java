package com.SprSt.StudySpring.Chapter3.SpringBootSimpleApplication;

import org.jspecify.annotations.Nullable;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class springBootSimpleApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(springBootSimpleApplication.class);
        app.setBanner(new Banner() {
            @Override
            public void printBanner(Environment environment, @Nullable Class<?> sourceClass, PrintStream out) {
                out.println("\n\n\tThis is my own banner!\n\n".toUpperCase());
            }
        });
        app.run(args);
    }
}
