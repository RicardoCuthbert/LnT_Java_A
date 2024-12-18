package main;

import java.util.ArrayList;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	public Main() {
		// Array
		// cara 1
		String[] makanan = {"Bulgogi", "Pizza", "Kimbab", "Cookie", "Burger"};
		System.out.println(makanan.length);
		
		// cara 2
		String[] makanan2;
		makanan2 = new String[] {"Bulgogi", "Pizza", "Kimbab", "Cookie", "Burger"};
		System.out.println(makanan2.length);
		
		// cara 3
		String[] makanan3 = new String[5];
		makanan3[0] = "Tacos";
		makanan3[2] = "Samyang";
		makanan3[1] = "Papeda";
		makanan3[3] = "Bika Ambon";
		makanan3[4] = "Gudeg";
		
		makanan3[1] = "Nasi Padang";
		
		for (String x : makanan3) {
			System.out.println(x);
		}
		
		System.out.println("============================================");
		
		// ArrayList
//		ArrayList<String> songList = new ArrayList<String>();
		
		//Vector
		Vector<String> songList = new Vector<String>();
		
		// Add = menambahkan isi list
		songList.add("About you"); // 0
		songList.add("Take a chance with me"); // 1
		songList.add("Guilty as sin"); // 2
		songList.add("Indonesia raya"); // 3
		
		for (String g : songList) {
			System.out.println(g);
		}
		
		// Size = mengecek ukuran list
		System.out.println(songList.size());
		
		// Set function = Untuk manip isi list
		songList.set(2, "Mr loverman");
		
		for (int i = 0; i < songList.size(); i++) {
			System.out.println(songList.get(i));
		}
		
		System.out.println("========================");
		System.out.println(songList.get(3));
		System.out.println(songList.indexOf("Indonesia raya"));
		
		// Clear = menghapus semua isi list
		songList.clear();
		if (songList.isEmpty()) {
			System.out.println("Lagu kosong");
		}
	}

}
