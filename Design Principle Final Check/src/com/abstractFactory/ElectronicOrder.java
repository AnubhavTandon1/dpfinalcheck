package com.abstractFactory;

public class ElectronicOrder extends Order {
	
	public void processOrder() {
		this.setChannel("Electronic channel");
		this.setProductType("Electronic Type");
		System.out.println("Electronic order is in process");
	}
}
