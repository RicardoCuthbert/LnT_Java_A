package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Vehicle> list = new ArrayList<Vehicle>();
	
	public Main() {
		// TODO Auto-generated constructor stub
		int choice = 0;
		do {
			System.out.println("Menu Kendaraan: ");
			System.out.println("===============");
			System.out.println("1. Add Vehicle");
			System.out.println("2. View Vehicle");
			System.out.println("3. Delete Vehicle");
			System.out.println("4. Exit");
			System.out.print(">> ");
			choice = scan.nextInt();
			scan.nextLine();
			
			switch (choice) {
			case 1: {
				addVehicle();
				System.out.println("Press to Continue");
				scan.nextLine();
				break;
			}case 2: {
				viewVehicle();
				System.out.println("Press to Continue");
				scan.nextLine();
				break;
			}case 3: {
				deleteVehicle();
				System.out.println("Press to Continue");
				scan.nextLine();
				break;
			}case 4: {
				exit();
				break;
			}
			default:
				System.out.println("Masukin menu yang bener!");
				System.out.println("Press to Continue");
				scan.nextLine();
				break;
			}
		} while (choice != 4);
	}
	
	public void addVehicle() {
		System.out.print("Vehicle's Brand: ");
		String brand = scan.nextLine();
		
		System.out.print("Vehilce's years: ");
		int years = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Vehicle's type [Car | Motor]: ");
		String type = scan.nextLine();
		
		if(type.compareToIgnoreCase("Car") == 0) {
			System.out.print("Car's Doors: ");
			int doors = scan.nextInt();
			scan.nextLine();
			list.add(new Car(brand, years, doors));
		}else if(type.compareToIgnoreCase("Motor") == 0) {
			System.out.print("Motor's Handlers: ");
			int handlers = scan.nextInt();
			scan.nextLine();
			list.add(new Motor(brand, years, handlers));
		}
		
		System.out.println("Vehicle added successfully! :D");
	}
	
	public void viewVehicle() {
		System.out.println("Vehicle's list: ");
		System.out.println("================");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Car) {
				System.out.println(i+1 +". Car's Brand: " + list.get(i).getBrand() + "; " + list.get(i).getYear());
				System.out.println("Car's Door: " + ((Car)list.get(i)).getDoors());
			}else if (list.get(i) instanceof Motor) {
				System.out.println(i+1 + ". Motor's Brand: " + list.get(i).getBrand() + "; "+ list.get(i).getYear());
				System.out.println("Motor's Handler: " + ((Motor)list.get(i)).getHandler());
			}
		}
		System.out.println("================");
	}
	
	public void deleteVehicle() {
		viewVehicle();
		System.out.println("Please enter the index of vehicle");
		int index = scan.nextInt();
		scan.nextLine();
		list.remove(index-1);
		System.out.println("Vehilce's deleted successfully!");
	}
	
	public void exit() {
		System.out.println("Thank you for using our services!!");
		System.exit(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
