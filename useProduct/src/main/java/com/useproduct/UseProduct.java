package com.useproduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.product.entity.Product;

@RestController
@RequestMapping(value = "/home")
public class UseProduct {

	@Autowired
	RestTemplate res;

	@GetMapping(value = "/getProductviaUseProduct")
	public List<Product> findProduct() {
		String url = "http://localhost:8080/products/getAll";
		String url1 = "http://localhost:8081/gst/getTaxPercentage/";
		List<Product> products = res
				.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Product>>() {
				}).getBody();
//		return pro.getBody().stream().map(x -> {
//			Product temp = x;
//			if (hsn == x.getHsn()) {
//				x.setPrice(x.getPrice() + (x.getPrice() * tax.getBody() / 100));
//				temp = x;
//			}
//			return temp;
//		}).toList();
		products.forEach(x -> {
			long hsn = x.getHsn();
			Integer taxPercentage = res.exchange(url1 + hsn, HttpMethod.GET, null, Integer.class).getBody();
			int overAllAmount = x.getPrice() + (x.getPrice() * taxPercentage / 100);
			x.setPrice(overAllAmount);
		});
		return products;
	}

}
