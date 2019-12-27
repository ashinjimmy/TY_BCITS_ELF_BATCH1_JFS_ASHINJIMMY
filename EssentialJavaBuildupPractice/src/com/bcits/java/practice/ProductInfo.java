package com.bcits.java.practice;

public class ProductInfo {

	public static void main(String[] args) {
		
		ProductBeanObj pb1 = new ProductBeanObj();
		
		pb1.setProductName("Oreo Biscuts");
		pb1.setProductId(3390);
		pb1.setPrice(100);
		pb1.setQuality("Awsome!!!!!! ");
		
		ProductBeanObj pb2 = new ProductBeanObj();
		
		pb2.setProductName("Mi Note7 Pro");
		pb2.setProductId(8910);
		pb2.setPrice(16000);
		pb2.setQuality("Excellent :) ");
		
		ProductBeanObj pb3 = new ProductBeanObj();
		
		pb3.setProductName("Amul Ice-Cream");
		pb3.setProductId(1209);
		pb3.setPrice(150);
		pb3.setQuality("Good :3 ");
		
		ProductBeanObj pb4 = new ProductBeanObj();
		
		pb4.setProductName("CASIO Wrist Watch");
		pb4.setProductId(1267);
		pb4.setPrice(5000);
		pb4.setQuality("Super :) ");
		
		Object []arr = {pb1, pb2, pb3, pb4};
		for(Object a : arr) {
			System.out.println(a);
			System.out.println();
		}
		
	}
	    
}

