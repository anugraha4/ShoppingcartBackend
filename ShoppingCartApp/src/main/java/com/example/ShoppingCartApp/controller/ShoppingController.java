package com.example.ShoppingCartApp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {



    @PostMapping("/")
    public String AddProduct()
    {
        return "product added successfully";
    }
}
