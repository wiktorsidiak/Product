package com.inteca.Inteca.controller;


import com.inteca.Inteca.model.Produkt;
import com.inteca.Inteca.service.ProduktService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class GetAllProductsController {

    private final ProduktService produktService;

    @RequestMapping(value= {"/products"}, method= RequestMethod.GET)
    public List<Produkt> getAllProducts() {
        return produktService.getProducts();
    }
}
