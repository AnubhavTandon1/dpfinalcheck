package com.abstractFactory;

public class Main {

	public static void main(String[] args) {
		Order one = new ElectronicOrder();
		one.processOrder();
		
		Order two = new FurnitureOrder();
		two.processOrder();
		
		Order three = new ToysOrder();
		three.processOrder();
	}

}
