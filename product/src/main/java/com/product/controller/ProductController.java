package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	ProductService proSer;

	@PostMapping(value = "/insertAll")
	public String insertAll(@RequestBody List<Product> pro) {
		return proSer.insertAll(pro);
	}

	@GetMapping(value = "/getAll")
	public List<Product> getAll() {
		return proSer.getAll();
	}

}
