package com.inteca.Inteca.model;

import lombok.Data;
import javax.persistence.*;

@Entity(name = "product")
@Data
public class Produkt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "credit_id")
    private long creditId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_name")
    private float productValue;
}
