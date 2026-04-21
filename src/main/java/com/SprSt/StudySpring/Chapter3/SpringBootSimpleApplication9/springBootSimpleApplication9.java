package com.SprSt.StudySpring.Chapter3.SpringBootSimpleApplication9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/** Запуск при помощи mycfg-qa.properties возможен
 *  с VM -Dspring.config.name=mycfg -Dspring.profiles.active=qa
 *  в случае с prod достаточно VM -Dspring.profiles.active=prod**/

@SpringBootApplication
public class springBootSimpleApplication9 {

    private static final Logger log = LoggerFactory.getLogger(springBootSimpleApplication9.class);

    public static void main(String[] args) {
        SpringApplication.run(springBootSimpleApplication9.class, args);
    }

    @Value("${server.ip}")
    String serverIp;

    @Bean
    CommandLineRunner values() {
        return args -> {
            log.info("> The Server IP is: " +  serverIp);
        };
    }
}
