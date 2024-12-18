package main;

import object.Orang;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Orang orang = new Orang("John luke", "Male", 55, 150);
		Orang orang2 = new Orang("Jane luke", "Female", 105, 190);
		
//		"John luke", "Male", 55, 150
//		orang.name = "John luke";
//		orang.gender = "Male";
//		orang.age = 55;
//		orang.tb = 150;
//		
//		orang2.name = "Jane doe";
//		orang2.gender = "Female";
//		orang2.age = 100;
//		orang2.tb = 180;
		
		System.out.println(orang2.name);
		System.out.println(orang.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
}
