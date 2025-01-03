package main;

public class Vehicle {
	private String brand;
	private String model;
	private int years;

	public Vehicle(String brand, String model, int years) {
		this.brand = brand;
		this.model = model;
		this.years = years;
	}
	
	public void displayInfo() {
		System.out.println("Vehicle's brand: " + brand + "; Model: " +model+ "Year: " + years);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

}
