package com.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query(value = "select p from Product p")
	public List<Product> getAll();

}
