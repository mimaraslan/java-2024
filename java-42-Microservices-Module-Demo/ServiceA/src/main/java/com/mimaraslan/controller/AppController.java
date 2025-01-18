package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

//       http://localhost:9091

@RestController
@RequestMapping
public class AppController {

    @GetMapping
    public String getAppDockerHello() {
        return "Service A : " + LocalDateTime.now();
   }

    @GetMapping("/info")
    public String getInfo(){
        return "INFO: Service A";
    }
}