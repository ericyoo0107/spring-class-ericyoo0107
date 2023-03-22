package com.jscode.jscode.week4.controller;

import com.jscode.jscode.week4.dto.Product;
import com.jscode.jscode.week4.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ProductController {
    private final ProductService productService;
    //상품 생성
    @PostMapping("/api/products")
    public String recieveProduct(@RequestBody Product product)
    {
        productService.saveProduct(product);
        return "saveOK";
    }
    //상품 전체 보여줌
    @GetMapping("/api/products")
    public List<Product> showAllProduct()
    {
        return productService.findAll();
    }
    //id 반환하면 해당 상품 보여줌
    @GetMapping("/api/products/{id}")
    public Product showOneByPath(@PathVariable int id)
    {
        return productService.findOne(id);
    }
        //에러 발생해서 지움 => showAllProduct랑 겹침 @RequestParam 넣어서 괜찮을줄 알았는데 아닌듯
//    //id 반환하면 해당 상품 보여줌
//    @GetMapping("/api/products")
//    public Product showOneByParam(@RequestParam int id)
//    {
//        return productService.findOne(id);
//    }
}
