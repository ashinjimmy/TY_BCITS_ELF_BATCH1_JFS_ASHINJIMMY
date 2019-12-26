package com.bcits.java.practice;

public class ProductBeanObj {

	private String productName;
	private int productId;
	private double price;
	private String quality;
	
	public ProductBeanObj() {
		//super();
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return " productName = " + productName + ", productId = " + productId + ", price = " + price
				+ ", quality = " + quality;
	}
	
	}


