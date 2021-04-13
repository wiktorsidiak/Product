package com.inteca.Inteca.service;

import com.inteca.Inteca.dao.ProductDAO;
import com.inteca.Inteca.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductDAO productDAO;

    @Override
    public void createProduct(Product produkt) {
     productDAO.createProduct(produkt);
    }

    @Override
    public List<Product> getProducts() {
        return productDAO.getProducts();
    }
}
