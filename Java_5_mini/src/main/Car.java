package main;

public class Car extends Vehicle {
	private int doors;

	public Car(String brand, String model, int years, int doors) {
		super(brand, model, years);
		this.doors = doors;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Car's doors: " + doors);
		System.out.println();
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

}
