package com.skillstorm.week4;

public class Customer {

	private IceCream iceCream;
	private String name;

	public Customer(String name) {
		this.name = name;
	}

	public IceCream getIceCream() {
		return iceCream;
	}

	public void setIceCream(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
