package com.SprSt.StudySpring.Chapter2.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @GetMapping("/")
    public String welcome() {
        return "<h1><font face='verdana'>Spring Boot Rocks!</font></h1>";
    }
}