package com.inteca.Inteca.service;

import com.inteca.Inteca.model.Produkt;

import java.util.List;

public interface ProduktService {

    void createProduct(Produkt produkt);

    List<Produkt> getProducts();
}

