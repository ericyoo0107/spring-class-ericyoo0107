package com.jscode.jscode.week4.repository;

import com.jscode.jscode.week4.dto.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
@Slf4j
public class ProductRepository {
    private List<Product> productRepository = new ArrayList();

    public void saveProduct(Product product)
    {
        productRepository.add(product);
        log.info(String.valueOf(product));
    }

    public List<Product> findAll()
    {
        return productRepository;
    }

    public Product findOne(int idx)
    {
        return productRepository.get(idx);
    }

    public boolean findSameProductName(Product product)
    {
        for (Product tempProduct : productRepository) {
            if(tempProduct.getName().equals(product.getName())) //문자열은 ==를 통해 비교하면 안됨
                return true;
        }
        return false;
    }
}
