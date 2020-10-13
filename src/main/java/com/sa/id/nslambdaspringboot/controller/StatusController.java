package com.sa.id.nslambdaspringboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@RestController
@CrossOrigin
@RequestMapping("/api")
public class StatusController {

    public static String ALIVE = "ALIVE";

    @GetMapping(path = "/status")
    public String getStatus() {
        return ALIVE;
    }
}
