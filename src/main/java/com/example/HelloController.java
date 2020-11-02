package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/user")
    public String user() {
        return "User";
    }
    @GetMapping("/admin")
    public String admin() {
        return "Admin";
    }
}
