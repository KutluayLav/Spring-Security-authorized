package com.kutluayulutas.inmemory.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {


    @GetMapping
    public String privateHelloWorld(){
        return "private hello world endpoint";
    }

    @GetMapping("/user")
    //@PreAuthorize("hasRole('USER')")
    public String privateHelloWorldForUser(){
        return "private hello world For User endpoint";
    }
    @GetMapping("/admin")
    //@PreAuthorize("hasRole('ADMIN')")
    public String privateHelloWorldForAdmin(){
        return "private hello world For Admin endpoint";
    }
}
