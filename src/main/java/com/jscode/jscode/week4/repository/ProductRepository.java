package com.jscode.jscode.week4.repository;

import com.jscode.jscode.week4.dto.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
@Slf4j
public class ProductRepository {
    private Map<Integer, Product> productRepository = new HashMap<>();

    public Product saveProduct(Integer id, Product product)
    {
        productRepository.put(id, product);
        log.info(String.valueOf(id));
        log.info(String.valueOf(product));
        return product;
    }
}
