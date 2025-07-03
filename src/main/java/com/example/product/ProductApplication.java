package com.example.product;

import Controller.ProductController;
import Service.ProductService;
import Repository.ProductRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductApplication {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Fetch ProductController bean
		ProductController productController = context.getBean(ProductController.class);

		// Example: Add a product
		Repository.Product newProduct = new Repository.Product();
		newProduct.setName("Test Product");

		System.out.println("Creating product...");
		productController.createProduct(newProduct);

		// Fetch all products
		System.out.println("All products:");
		productController.getAllProducts().forEach(p ->
				System.out.println("Product ID: " + p.getId() + ", Name: " + p.getName())
		);
	}
}

