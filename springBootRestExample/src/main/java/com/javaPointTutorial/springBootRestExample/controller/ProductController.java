package com.javaPointTutorial.springBootRestExample.controller;

import com.javaPointTutorial.springBootRestExample.model.Product;
import com.javaPointTutorial.springBootRestExample.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @GetMapping(value = "/product")
    public List<Product> getProduct(){
        List<Product> products = iProductService.findAll();
        return products;
    }
}
