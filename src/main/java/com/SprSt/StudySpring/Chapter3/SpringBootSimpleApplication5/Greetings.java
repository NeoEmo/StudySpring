package com.SprSt.StudySpring.Chapter3.SpringBootSimpleApplication5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {

    @GetMapping("/")
    String greetings() {
        return "This is something new :D";
    }
}
