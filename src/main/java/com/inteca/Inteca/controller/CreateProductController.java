package com.inteca.Inteca.controller;

import com.inteca.Inteca.model.Produkt;
import com.inteca.Inteca.service.ProduktServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CreateProductController {

    private ProduktServiceImpl produktService;

    @RequestMapping(value= {"/addProduct"}, method= RequestMethod.POST)
    public void createProduct(Produkt produkt) {
        produktService.createProduct(produkt);
    }
}
