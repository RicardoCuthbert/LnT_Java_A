package main;

public class Motorcycle extends Vehicle {

	private String type;

	public Motorcycle(String brand, String model, int years, String type) {
		super(brand, model, years);
		this.type = type;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Motor's Type: " + type);
		System.out.println();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
