package com.example.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApplication {

	private Long id;
	private String name;

	public void setId(Long id) {
		this.id = id;
	}

	public ProductApplication(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}

	public static void main(String[] args) {

		SpringApplication.run(ProductApplication.class, args);
	}

}
