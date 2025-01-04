package main;

public class Car extends Vehicle {

	private int doors;

	public Car(String brand, int year, int doors) {
		super(brand, year);
		this.doors = doors;
		// TODO Auto-generated constructor stub
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub

	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
