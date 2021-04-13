package com.inteca.Inteca.controller;


import com.inteca.Inteca.model.Product;
import com.inteca.Inteca.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class GetAllProductsController {

    private final ProductService productService;

    @RequestMapping(value= {"/products"}, method= RequestMethod.GET)
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }
}
