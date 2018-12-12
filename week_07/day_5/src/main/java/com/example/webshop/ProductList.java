package com.example.webshop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ProductList {

    private List<Product> products;

    public ProductList() {
        products = new ArrayList<>();

        products.add(new Product("Running Shoes", "Nike running shoes for every day sport", 1000, 5));
        products.add(new Product("Printer", "HP printer to kill the environment", 3000, 2));
        products.add(new Product("Coca Cola", "0.5 liter coke", 25, 0));
        products.add(new Product("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100));
        products.add(new Product("T-shirt", "Blue with corgi on a bike", 300, 1));
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Product> availableStock() {

        return products
                .stream()
                .filter(p -> p.getQuantity() > 0)
                .collect(toList());
    }

    public List<Product> contains() {
        return products
                .stream()
                .filter(p -> p.getDescription().contains("Nike"))
                .collect(toList());
    }
}