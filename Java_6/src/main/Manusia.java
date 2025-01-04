package main;

public class Manusia {
	private String name;
	private int age;

	// alt + shift + s
	public Manusia(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void Speak() {
		System.out.println("Hi, my name " + name + ". I'm " + age + " years old");
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

	
}
