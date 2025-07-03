package com.example.product.Controller;

import Repository.Product;
import Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public Product createProduct(Product product) {
        return productService.createProduct(product);
    }

    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}

