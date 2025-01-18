package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

//       http://localhost:8080

@RestController
@RequestMapping
public class AppController {


//       http://localhost:8080

    @GetMapping
    public String getAppDockerHello() {
        return "App Hello Docker : " + LocalDateTime.now();
   }

}