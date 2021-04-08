package com.inteca.Inteca.controller;


import com.inteca.Inteca.model.Produkt;
import com.inteca.Inteca.service.ProduktServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GetAllProductsController {
    private ProduktServiceImpl produktService;

    @RequestMapping(value= {"/products"}, method= RequestMethod.GET)
    public List<Produkt> getAllProducts() {
        return produktService.getProducts();
    }
}
