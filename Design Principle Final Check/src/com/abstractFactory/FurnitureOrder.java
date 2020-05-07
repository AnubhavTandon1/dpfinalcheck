package com.abstractFactory;

public class FurnitureOrder extends Order {
	
	public void processOrder() {
		this.setChannel("Furniture channel");
		this.setProductType("Furniture Type");
		System.out.println("Furniture order is in process");
	}
}
