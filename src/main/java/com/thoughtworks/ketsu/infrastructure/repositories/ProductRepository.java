package com.thoughtworks.ketsu.infrastructure.repositories;

import com.thoughtworks.ketsu.infrastructure.core.Product;
import com.thoughtworks.ketsu.infrastructure.mybatis.mappers.ProductMapper;
import com.thoughtworks.ketsu.infrastructure.records.ProductRecord;

import javax.inject.Inject;
import java.util.Map;

/**
 * Created by syzhang on 7/18/16.
 */
public class ProductRepository implements com.thoughtworks.ketsu.infrastructure.core.ProductRepository {
    @Inject
    ProductMapper productMapper;

    @Override
    public Product createProduct(Map<String, Object> info) {

        productMapper.saveProduct(info);

        int productId = Integer.valueOf(String.valueOf(info.get("id")));

        return productMapper.findById(productId);
    }
}
