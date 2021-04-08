package com.inteca.Inteca.dao;

import com.inteca.Inteca.mapper.ProductMapper;
import com.inteca.Inteca.model.Produkt;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Repository
@RequiredArgsConstructor
public class ProductDAOImpl implements ProductDAO{

    private JdbcTemplate jdbcTemplate;

    @Override
    public void createProduct(Produkt produkt) {
        String SQLProduct = "INSERT INTO product (product_name, product_value) VALUES (?, ?)";
        jdbcTemplate.update(SQLProduct, produkt.getProductName(), produkt.getProductValue());
    }

    @Override
    public List<Produkt> getProducts() {
        String SQL = "SELECT * FROM product";
        RowMapper<Produkt> produktMapper = new ProductMapper();
        return jdbcTemplate.query(SQL, produktMapper);
    }
}
