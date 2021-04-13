package com.inteca.Inteca.model;

import lombok.Data;
import javax.persistence.*;

@Entity(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credit_id")
    private long creditId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_name")
    private float productValue;
}