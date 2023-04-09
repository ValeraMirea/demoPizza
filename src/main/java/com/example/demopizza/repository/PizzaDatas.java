package com.example.demopizza.repository;

import com.example.demopizza.model.Pizza;
import org.springframework.data.repository.CrudRepository;

public interface PizzaDatas extends CrudRepository<Pizza,Integer> {
}
