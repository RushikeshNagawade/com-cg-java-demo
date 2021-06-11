package com.cg.demo.method;

public class Product {
	
	// four fields
	int cost;
	String rawMaterial;
	double qualityScore;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int cost, String rawMaterial, double qualityScore) {
		super();
		this.cost = cost;
		this.rawMaterial = rawMaterial;
		this.qualityScore = qualityScore;
		
		
	}

	public Product(int cost, String rawMaterial) {
		super();
		this.cost = cost;
		this.rawMaterial = rawMaterial;
	}

	@Override
	public String toString() {
		return "Product [cost=" + cost + ", rawMaterial=" + rawMaterial + ", qualityScore=" + qualityScore + "]";
	}
	
}
	
//	Product() {
////		System.out.println(" default constructor ");
//		
//	}
//	
//	Product(int cost, String rawMaterial, double qualityScore) {
//		this.cost = cost;
//		this.rawMaterial = rawMaterial;
//		this.qualityScore = qualityScore;
//		System.out.println("parameterized constructor ");
//		
//	}
//	
//	Product(int cost, String rawMaterial) {
//		this.cost = cost;
//		this.rawMaterial = rawMaterial;
//		System.out.println(" two parameterized constructor ");
//		
//	}
//
//
//	@Override
//	public String toString() {
//		return "Product [cost=" + cost + ", rawMaterial=" + rawMaterial + ", qualityScore=" + qualityScore + "]";
//	}
//	
//
//}
