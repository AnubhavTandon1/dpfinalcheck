package com.abstractFactory;

public class ToysOrder extends Order {
	
	public void processOrder() {
		this.setChannel("Toys channel");
		this.setProductType("Toys Type");
		System.out.println("Toys order is in process");
	}
}
