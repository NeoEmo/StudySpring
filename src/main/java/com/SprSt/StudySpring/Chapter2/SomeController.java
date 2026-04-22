package com.SprSt.StudySpring.Chapter2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
}