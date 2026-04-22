package com.SprSt.StudySpring.Chapter3.SpringBootSimpleApplication6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.List;
import java.io.IOException;

@SpringBootApplication
public class SpringBootSimpleApplication6 {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringBootSimpleApplication6.class, args);
    }
}

@Component
class MyComponent {
    private static final Logger log = LoggerFactory.getLogger(MyComponent.class);

    @Autowired
    public MyComponent(ApplicationArguments args) {
        boolean enable = args.containsOption("enable");

        if(enable) {
            log.info("## > You are enabled!");
        }

        List<String> _args = args.getNonOptionArgs();
        log.info("## > extra args...");

        if(!_args.isEmpty()) {
            _args.forEach(file -> log.info(file));
        }
    }
}
