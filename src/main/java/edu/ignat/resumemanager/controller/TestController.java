package edu.ignat.resumemanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/v1/test")
    public String test() {
        return "Resume manager application is working";
    }
}

