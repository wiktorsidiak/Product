package com.inteca.Inteca.mapper;

import com.inteca.Inteca.model.Produkt;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Produkt> {
    @Override
    public Produkt mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Produkt produkt = new Produkt();
        produkt.setCreditId(resultSet.getLong("credit_id"));
        produkt.setProductName(resultSet.getString("product_name"));
        produkt.setProductValue(resultSet.getFloat("product_value"));
        return produkt;

    }
}
