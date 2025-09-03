package com.Prathamesh.SpringSecurityP02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @GetMapping("/contactUs")
    public String contactUS(){
        return "Contact US at: 9665484038";
    }

    @GetMapping("/transfer")
    public String transfer()
    {
        return "money transfer successful";
    }

    @GetMapping("/admin")
    public String admin()
    {
        return "welcome admin";
    }

    @GetMapping("/about")
    public String about()
    {
        return "Prathamesh Jadhav founder of Prathamesh Bank Fund";
    }
}
