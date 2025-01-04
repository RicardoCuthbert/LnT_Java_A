package main;

public abstract class Vehicle {
	private String brand;
	private int year;

	public Vehicle(String brand, int year) {
		super();
		this.brand = brand;
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public abstract void go();

	public abstract void start();

	public abstract void stop();
}
