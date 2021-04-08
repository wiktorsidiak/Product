package com.inteca.Inteca.dao;

import com.inteca.Inteca.model.Produkt;
import java.util.List;

public interface ProductDAO {
    void createProduct(Produkt produkt);

    List<Produkt> getProducts();
}
