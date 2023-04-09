package com.example.demopizza.controller;

import com.example.demopizza.model.Pizza;
import com.example.demopizza.repository.PizzaDatas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PizzaController {

    @Autowired
    PizzaDatas repository;

    @GetMapping("/add")
    public @ResponseBody String add(@RequestParam String name,
                                    @RequestParam Integer size){
        Pizza pizza = new Pizza(name,size);
        repository.save(pizza);
        return "Save Successeful!";
    }

    @GetMapping("/list")
    public @ResponseBody Iterable<Pizza> getAll(){
        return repository.findAll();
    }
}
