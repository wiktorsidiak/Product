package com.inteca.Inteca.service;

import com.inteca.Inteca.dao.ProductDAO;
import com.inteca.Inteca.model.Produkt;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProduktServiceImpl implements ProduktService{

    private final ProductDAO productDAO;

    @Override
    public void createProduct(Produkt produkt) {
     productDAO.createProduct(produkt);
    }

    @Override
    public List<Produkt> getProducts() {
        return productDAO.getProducts();
    }
}
