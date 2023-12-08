package com.skillstorm.week4;

import java.util.ArrayList;

public class IceCreamShop {

	private String name;
	private double amountEarned;
	private ArrayList<IceCream> flavors;
	private ArrayList<Customer> customerLine = new ArrayList<>();

	public IceCreamShop(String name) {
		this.name = name;
		this.flavors = new ArrayList<>();
	}

	public void serviceCustomer() {
		if (customerLine.isEmpty()) {
			throw new IllegalStateException("There are no Customers");
		}
		Customer currentCustomer = customerLine.get(0);

		if (currentCustomer.getIceCream() == null) {
			throw new IllegalArgumentException("Customer does not have an ice cream.");
		}

		if (!flavors.stream().anyMatch(flavor-> flavor.getFlavor().equals(currentCustomer.getIceCream().getFlavor()))) {
			throw new IllegalArgumentException("Selected Ice Cream is not available");
		}

		amountEarned += currentCustomer.getIceCream().getPrice();
		customerLine.remove(0);
	}

	public void addCustomer(Customer c) {
		customerLine.add(c);
	}

	public void addFlavor(IceCream flavor) {
		flavors.add(flavor);
	}

	public double getAmountEarned() {
		return amountEarned;
	}

}
