package main;

public class Manusia {
	
	// Encapsulation -> membungkus data dari suatu class
	// Data hanya bisa dimanipulasi menggunakan method getter & setter
	
	private String name;
	private int age;
	private String gender;
	
	public Manusia(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public final void tes() {
		System.out.println("Happy new year!");
	}
	
	public void kenal() {
		System.out.println("Hi, nama saya " + name + ", umur saya " + age + ". Saya adalah seorang " + gender);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
}
