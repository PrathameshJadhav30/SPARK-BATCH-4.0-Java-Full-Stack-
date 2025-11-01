package com.Prathamesh.Docker_Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Welcome")
public class Controller {

    @GetMapping
    public String Welcome(){
        return "Welcome to Docker";
    }
}
