package com.SprSt.StudySpring.Chapter2.Listing2_6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webController {

    @GetMapping
    public String index() {
        return "Hello Spring Boot!";
    }
}
