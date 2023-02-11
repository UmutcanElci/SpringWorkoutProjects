package com.javaPointTutorial.springBootRestExample.service;

import com.javaPointTutorial.springBootRestExample.model.Product;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


public interface IProductService {
    List<Product> findAll();
}
