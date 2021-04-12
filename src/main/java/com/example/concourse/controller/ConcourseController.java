package com.example.concourse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConcourseController {

    @GetMapping(path = "/details")
    public String getDetails() {
        return "Hi, Welcome!";
    }
}
