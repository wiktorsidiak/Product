package com.inteca.Inteca.dao;

import com.inteca.Inteca.model.Product;
import java.util.List;

public interface ProductDAO {
    void createProduct(Product produkt);

    List<Product> getProducts();
}
