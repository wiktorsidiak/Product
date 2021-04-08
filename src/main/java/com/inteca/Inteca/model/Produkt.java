package com.inteca.Inteca.model;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Entity(name = "Product")
@Data
public class Produkt {
    @Column(name = "credit_id")
    private long productCreditId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_name")
    private float productValue;
}
