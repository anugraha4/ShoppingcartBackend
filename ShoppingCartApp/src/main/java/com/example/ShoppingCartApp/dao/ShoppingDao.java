package com.example.ShoppingCartApp.dao;

import com.example.ShoppingCartApp.model.Shopping;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingDao extends CrudRepository<Shopping,Integer> {
}
