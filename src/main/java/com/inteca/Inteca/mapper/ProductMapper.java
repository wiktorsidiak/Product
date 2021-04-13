package com.inteca.Inteca.mapper;

import com.inteca.Inteca.model.Product;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Product product= new Product();
        product.setCreditId(resultSet.getLong("credit_id"));
        product.setProductName(resultSet.getString("product_name"));
        product.setProductValue(resultSet.getFloat("product_value"));
        return product;

    }
}
