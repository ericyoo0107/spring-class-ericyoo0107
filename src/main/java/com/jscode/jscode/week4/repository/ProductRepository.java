package com.jscode.jscode.week4.repository;

import com.jscode.jscode.week4.dto.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
@Slf4j
public class ProductRepository {
    private List<Product> productRepository = new ArrayList();

    public Product saveProduct(Product product)
    {
        productRepository.add(product);
        log.info(String.valueOf(product));
        return product;
    }

    public List<Product> findAll()
    {
        return productRepository;
    }

    public Product findOne(int idx)
    {
        return productRepository.get(idx);
    }
}
