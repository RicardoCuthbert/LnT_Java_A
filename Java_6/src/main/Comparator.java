package main;

public class Comparator<T> {
	public void equals(T args1, T args2) {
		if (args1.equals(args2)) {
			System.out.println("Perbandingan = Sama");
		}else {
			System.out.println("Perbandingan = Tidak Sama");
		}
	}
}
