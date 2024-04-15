package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.ProductDao;
import com.product.entity.Product;

@Service
public class ProductService {

	@Autowired
	ProductDao proDao;

	public String insertAll(List<Product> pro) {
		return proDao.insertAll(pro);
	}

	public List<Product> getAll() {
		return proDao.getAll();
	}

}
