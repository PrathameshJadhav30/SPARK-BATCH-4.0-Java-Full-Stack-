package com.Prathamesh.Product_Service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {



    @GetMapping("/place")
    public String placeOrder()
    {
        return "Hello you order : Iphone is placed";
    }

    @GetMapping("/product/{name}")
    public String orderWithName(@PathVariable String name)
    {
        return "Hello "+name+" Your order done";
    }
}
