package com.selflearning.httpvshttps.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HttpVsHttps")
public class HttpController {

    @GetMapping("/hello")
    public String helloMethod(){
        return "Hello World!!!";
    }
}
