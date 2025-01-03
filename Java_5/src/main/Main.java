package main;

public class Main {

	public Main() {
		final int tes = 99;
		Manusia manusia1 = new Manusia(null, 0, null);
//		manusia1.age =55;
		manusia1.setName("Budji");
		manusia1.setAge(55);
		manusia1.setGender("Lanang");
		manusia1.kenal();
		
		System.out.println("============================================");
		Manusia manusia2 = new Manusia("Joker", 25, "Female");
		manusia2.kenal();
		
		System.out.println("============================================");
		Mahasiswa mahasiswa1 = new Mahasiswa("Halim", 21, "Male", "09765434567");
		mahasiswa1.kenal();
//		System.out.println(manusia1.getAge());
//		System.out.println(manusia1.getName());
//		System.out.println(manusia1.getGender());
//		
//		System.out.println(manusia2.getAge());
//		System.out.println(manusia2.getName());
//		System.out.println(manusia2.getGender());
	}

	public static void main(String[] args) {
		new Main();
	}

}
