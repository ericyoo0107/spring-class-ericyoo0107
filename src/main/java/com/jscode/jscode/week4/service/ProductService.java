package com.jscode.jscode.week4.service;

import com.jscode.jscode.week4.dto.Product;
import com.jscode.jscode.week4.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private Integer Id = 0;
    //아이디를 추가해서 상품 등록
    public void saveProduct(Product product)
    {
        Id++;
        productRepository.saveProduct(Id,product);
    }
}
