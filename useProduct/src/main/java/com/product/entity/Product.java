package com.product.entity;

public class Product {

	private int id;
	private String productName;
	private String quantity;
	private int price;
	private long hsn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public long getHsn() {
		return hsn;
	}

	public void setHsn(long hsn) {
		this.hsn = hsn;
	}

}
