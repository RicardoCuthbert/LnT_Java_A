package main;

public class Doctor extends Manusia {

	private String id;

	public Doctor(String name, int age, String id) {
		super(name, age);
		this.id = id;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Speak() {
		// TODO Auto-generated method stub
		super.Speak();
		System.out.println("Saya adalah seorang doctor");
	}
	
	// OverLoading
	public void Speak(String kata) {
		super.Speak();
		System.out.println("Saya adalah seorang dokter spesialis " + kata);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
