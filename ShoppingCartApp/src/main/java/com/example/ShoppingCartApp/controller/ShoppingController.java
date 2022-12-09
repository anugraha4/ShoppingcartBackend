package com.example.ShoppingCartApp.controller;

import com.example.ShoppingCartApp.model.Shopping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {



    @PostMapping(path="/",consumes = "application/json",produces = "application/json")
    public String AddProduct(@RequestBody Shopping s)
    {
        System.out.println(s.getProductname().toString());
        System.out.println(s.getImage().toString());
        System.out.println(s.getCategory().toString());
        System.out.println(s.getDescription().toString());
        System.out.println(s.getPrice().toString());
        return "product added successfully";
    }

    @GetMapping("/view")
    public String ViewAll()
    {
        return "view all products";
    }

    @PostMapping("/search")
    public String SearchProduct()
    {
        return "search products";
    }
}
