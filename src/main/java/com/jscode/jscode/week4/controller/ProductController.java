package com.jscode.jscode.week4.controller;

import com.jscode.jscode.week4.dto.Product;
import com.jscode.jscode.week4.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ProductController {
    private final ProductService productService;
    @PostMapping("/api/products")
    public void recieveProduct(@RequestBody Product product)
    {
        productService.saveProduct(product);
    }
    @GetMapping("/api/products")
    public List<Product> showAllProduct()
    {
        return productService.findAll();
    }
}
