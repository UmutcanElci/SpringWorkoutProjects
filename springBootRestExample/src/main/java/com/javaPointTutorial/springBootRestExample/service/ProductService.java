package com.javaPointTutorial.springBootRestExample.service;

import com.javaPointTutorial.springBootRestExample.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService implements IProductService{
    @Override
    public List<Product> findAll() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(100, "Mobile", "CLK98123", 9000.00, 6));
        products.add(new Product(101, "TV", "LGST09167", 60000.00, 9));
        products.add(new Product(102, "Washing Machine", "38753BK9", 9000.00, 3));
        products.add(new Product(103, "Refrigerator", "12WP9087", 10000.00, 4));
        products.add(new Product(104, "Labtop", "LHP29OCP", 24000.00, 1));

        return products;
    }
}
