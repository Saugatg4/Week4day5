package com.skillstorm.week4;

public class TestIceCreamShop {

	public static void main(String[] args) {

		IceCreamShop myIceCreamShop = new IceCreamShop("Sweet tooth");

		myIceCreamShop.addFlavor(new IceCream("Vanilla", 2.0));
		myIceCreamShop.addFlavor(new IceCream("Chocolate", 3.0));
		myIceCreamShop.addFlavor(new IceCream("Strawberry", 2.5));

		Customer customer1 = new Customer("John");
		Customer customer2 = new Customer("Ronald");

		myIceCreamShop.addCustomer(customer1);
		myIceCreamShop.addCustomer(customer2);

		customer1.setIceCream(new IceCream("Vanilla", 2.0));
		myIceCreamShop.serviceCustomer();

		System.out.println("Amount Earned : $" + myIceCreamShop.getAmountEarned());

		customer2.setIceCream(new IceCream("Cookies and Cream", 3.0));

		try {
			myIceCreamShop.serviceCustomer();
			System.out.println("Customer serviced successfully");
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
			System.out.println("Customer not serviced");
		}

		customer2.setIceCream(new IceCream("Chocolate", 3.0));
		myIceCreamShop.serviceCustomer();

		System.out.println("Total earnings : $" + myIceCreamShop.getAmountEarned());



	}

}
