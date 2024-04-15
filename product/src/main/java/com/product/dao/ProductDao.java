package com.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Repository
public class ProductDao {

	@Autowired
	ProductRepository proRepo;

	public String insertAll(List<Product> pro) {
		proRepo.saveAll(pro);
		return "All Products Save Successfully";
	}

	public List<Product> getAll() {
		return proRepo.getAll();
	}

}
