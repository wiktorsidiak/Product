package com.inteca.Inteca.service;

import com.inteca.Inteca.model.Product;

import java.util.List;

public interface ProductService {

    void createProduct(Product produkt);

    List<Product> getProducts();
}

