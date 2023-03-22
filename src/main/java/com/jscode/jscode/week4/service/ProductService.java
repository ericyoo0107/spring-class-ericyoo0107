package com.jscode.jscode.week4.service;

import com.jscode.jscode.week4.dto.Product;
import com.jscode.jscode.week4.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    //상품등록
    public void saveProduct(Product product) {
        if (productRepository.findSameProductName(product)) {
            throw new RuntimeException();
        }
        productRepository.saveProduct(product);
    }


    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findOne(int idx) {
        return productRepository.findOne(idx);
    }

    public Product findByName(String name) {
        int idx = productRepository.findByName(name);
        if (idx == -1)
            throw new RuntimeException();
        return productRepository.findOne(idx);
    }
}
