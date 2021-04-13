package com.inteca.Inteca.controller;

import com.inteca.Inteca.model.Product;
import com.inteca.Inteca.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class CreateProductController {

    private final ProductService productService;

    @RequestMapping(value= {"/addProduct"}, method= RequestMethod.POST)
    public void createProduct(@RequestBody Product product) {
        productService.createProduct(product);
    }
}
