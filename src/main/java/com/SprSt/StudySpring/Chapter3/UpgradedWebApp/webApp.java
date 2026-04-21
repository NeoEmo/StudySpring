package com.SprSt.StudySpring.Chapter3.UpgradedWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Жалко что в нынешних реалиях я не могу запустить через Spring boot CLI Аналог WebApp.Groovy D:
 * Из Spring Boot CLI убрали команду run**/

@RestController
public class webApp {

    @GetMapping("/")
    String greetings() {
        return "Spring Boot Rocks!";
    }

    public static void main(String[] args) {
        SpringApplication.run(webApp.class, args);
    }
}
