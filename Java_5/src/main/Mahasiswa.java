package main;

public class Mahasiswa extends Manusia {

	private String nim;

	public Mahasiswa(String name, int age, String gender, String nim) {
		super(name, age, gender);
		this.nim = nim;
	}

	@Override
	public void kenal() {
		// TODO Auto-generated method stub
		super.kenal();
		System.out.println("NIM saya: " + nim);
	}

	// alt + shift + s
	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

}
