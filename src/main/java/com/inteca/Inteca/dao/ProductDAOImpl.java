package com.inteca.Inteca.dao;

import com.inteca.Inteca.mapper.ProductMapper;
import com.inteca.Inteca.model.Product;
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

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void createProduct(Product product) {
        String SQLProduct = "INSERT INTO product (credit_id,product_name, product_value) VALUES (?, ?, ?)";
        jdbcTemplate.update(SQLProduct, product.getCreditId(), product.getProductName(),(product.getProductValue()));
    }

    @Override
    public List<Product> getProducts() {
        String SQL = "SELECT * FROM product";
        RowMapper<Product> produktMapper = new ProductMapper();
        return jdbcTemplate.query(SQL, produktMapper);
    }
}

