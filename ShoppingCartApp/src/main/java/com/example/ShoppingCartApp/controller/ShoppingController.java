package com.example.ShoppingCartApp.controller;

import com.example.ShoppingCartApp.dao.ShoppingDao;
import com.example.ShoppingCartApp.model.Shopping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingController {

    @Autowired
    private ShoppingDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String AddProduct(@RequestBody Shopping s)
    {
        System.out.println(s.getProductname().toString());
        System.out.println(s.getImage().toString());
        System.out.println(s.getCategory().toString());
        System.out.println(s.getDescription().toString());
        System.out.println(s.getPrice().toString());
        dao.save(s);
        return "product added successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Shopping> ViewAll()
    {
        return (List<Shopping>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/search")
    public String SearchProduct()
    {
        return "search products";
    }
}
