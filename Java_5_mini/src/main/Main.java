package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public Main() {

		int choice = 0;
		do {
			System.out.println("Vehicle Menu: ");
			System.out.println("1. Add Vehicle");
			System.out.println("2. Show All Vehicle");
			System.out.println("3. Exit");
			System.out.print(">> ");
			choice = scan.nextInt();
			scan.nextLine();

			switch (choice) {
			case 1: {
				addVehicle();
				System.out.println("Press enter to continue!");
				scan.nextLine();
				break;
			}
			case 2: {
				showAll();
				System.out.println("Press enter to continue!");
				scan.nextLine();
				break;
			}
			case 3: {
				System.out.println("Thank you for using our services! :>");
				System.exit(0);
				break;
			}
			default:
				System.out.println("Masukin angka yang bener bro");
				System.out.println("Press enter to continue!");
				scan.nextLine();
				break;
			}
		} while (choice <= 3 && choice >= 1);
	}

	public void addVehicle() {
		System.out.print("Vehicle's Brand: ");
		String brand = scan.nextLine();
		
		System.out.print("Vehicle's Model: ");
		String model = scan.nextLine();
		
		System.out.print("Vehicle's Years: ");
		int years = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Vehicle's Type [Car | Motor]: ");
		String vehicleType = scan.nextLine();
		
		if (vehicleType.compareToIgnoreCase("Car") == 0) {
			System.out.print("Car's Doors: ");
			int doors = scan.nextInt();
			scan.nextLine();
			Car car = new Car(brand, model, years, doors);
			vehicleList.add(car);
		}else if (vehicleType.compareToIgnoreCase("Motor") == 0) {
			System.out.print("Motor's Type: ");
			String motorType = scan.nextLine();
			Motorcycle motor = new Motorcycle(brand, model, years, motorType);
			vehicleList.add(motor);
		}
		
		System.out.println("Vehicle added successfully");
	}
	
	public void showAll() {
		System.out.println("Vehicle in the menu: ");
		for (int i = 0; i < vehicleList.size(); i++) {
			System.out.print(i+1 +". ");
			vehicleList.get(i).displayInfo();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
