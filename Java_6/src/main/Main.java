package main;

import java.util.ArrayList;

import abstraction.Car;
import abstraction.Motor;
import abstraction.Vehicle;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Manusia manusia1 = new Manusia("Yi ji", 25);
		manusia1.Speak();
		System.out.println("=================================================");
		System.out.println();
		
		Manusia manusia2 = new Manusia("Hee do", 21);
		manusia2.Speak();
		System.out.println("=================================================");
		System.out.println();
		
		
		// Overriding = sub class yang meng-override method dari parent class
		Doctor doctor = new Doctor(null, 0, null);
		doctor.setName("Ik jun");
		doctor.setAge(35);
		doctor.setId("HP001");
		doctor.Speak();
		System.out.println("=================================================");
		System.out.println();
		
		// Overloading = Method dengan nama yang sama, tetapi dengan parameter yang berbeda 
		doctor.Speak("Saraf");
		System.out.println("=================================================");
		System.out.println();
		
		// Parametric Polymorphism (Tidak bisa menerima primitive type, seperti int, double, dll)
		Comparator<String> comparator = new Comparator<String>();
//		ArrayList<Integer> list = new ArrayList<Integer>();
		
		comparator.equals("Hallo ", "Hallo");
		System.out.println("=================================================");
		System.out.println();
		
		// Konsep Abstraction
//		Vehicle vehicle = new Vehicle();
		
		Motor motor = new Motor();
		motor.start();
		motor.go();
		motor.stop();
		System.out.println("=================================================");
		System.out.println();
		
		// Cara membuat object car dengan reference class car (Cara 1)
		Car car = new Car();
		car.start();
		car.go();
		car.stop();
		car.openDoors();
		System.out.println("=================================================");
		System.out.println();
		
		// Cara membuat onject car dengan reference class vehicle (Cara 2)
		Vehicle car2 = new Car();
		car2.start();
		car2.go();
		car2.stop();
//		car2.openDoors();
		System.out.println("=================================================");
		System.out.println();
		
		// Casting
		// Cara 1
		Car sementara = (Car) car2;
		sementara.openDoors();
		
		// Cara 2
		((Car)car2).openDoors();
		System.out.println("=================================================");
		System.out.println();
		
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(car);
		vehicleList.add(motor);
		
		for (int i = 0; i < vehicleList.size(); i++) {	
			if (vehicleList.get(i)  instanceof Car) {
				System.out.println(i+1 +". Kendaran ini adalah mobil");
			}else if (vehicleList.get(i) instanceof Motor) {
				System.out.println(i+1 + ". Kendaraan ini adalah motor");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
