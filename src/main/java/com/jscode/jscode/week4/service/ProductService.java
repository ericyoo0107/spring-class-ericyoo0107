package com.jscode.jscode.week4.service;

import com.jscode.jscode.week4.dto.Product;
import com.jscode.jscode.week4.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    //상품등록
    public void saveProduct(Product product)
    {
        productRepository.saveProduct(product);
    }

    public List<Product> findAll()
    {
        return productRepository.findAll();
    }
}
