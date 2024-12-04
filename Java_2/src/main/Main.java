package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String manip
		String a = "Budiono";
		
		// length
		System.out.println(a.length());
		
		// startwith
		System.out.println(a.startsWith("b"));
		
		// endwith
		System.out.println(a.endsWith("O"));
		
		// equals
		System.out.println(a.equals("budiono"));
		System.out.println(a.equalsIgnoreCase("bUdIoNo"));
		
		// tolowercase = mengubah semua menjadi huruf kecil
		String b = "NASI PADANGGG";
		System.out.println(b.toLowerCase());
		
		// touppercase = mengubah semua menjadi huruf kapital
		String c = "barbarian king!";
		System.out.println(c);
		System.out.println(c.toUpperCase());
		
		// contains = untuk mengecek apakah di string tsb ada kata atau kalimat yang kita cek
		String email = "udinsaipudin@gmail.com";
		System.out.println(email.contains("@"));
		
		// charat = untuk mencari kata di index tertentu
		System.out.println(email.charAt(4));
		
		// concat = untuk menggabungkan beberapa/satu string
		String x = "Pizza";
		System.out.println(x.concat(" Burger" + " KFC" + " BNCC"));
		
		// substring = mencari kata atau beberapa kata dalam string
		System.out.println(x.substring(1));
		System.out.println(x.substring(1, 4));
		
		// MATH FUNCTION
		// sqrt = akar
		double num = Math.sqrt(60);
		System.out.println(num);
		System.out.println((int)num);
		
		// pow = pangkat
		System.out.println(2 * 2 * 2);
		System.out.println((int)Math.pow(2, 3));
		
		// ceil & floor = bulat ke atas dan bulat ke bawah
		double duit = 50.4;
		System.out.println(Math.ceil(duit));
		System.out.println(Math.floor(duit));
		
		// round = pembulatan
		double duit1 = 50.5;
		System.out.println(Math.round(duit)); //alt + ctrl + arrow bawah
		System.out.println(Math.round(duit1));
		
		// rint = sama seperti round, cuma angka genap terdekat
		double j = 1.4;
		System.out.println(Math.round(j));
		System.out.println(Math.rint(j));
		
		// log = log e() // ln
		// Math.E = bilangan natural (e)
		System.out.println(Math.log(Math.E));
		
		// log10 = log yang biasa/ log 10 ()
		System.out.println(Math.log10(100));
		
		// todegree = mengubah radians ke bentuk degree
		System.out.println(Math.toDegrees(Math.PI));
		
		// toradians = mengubah degree ke bentuk radiant
		System.out.println(Math.toRadians(180));
		
		// sin cos tan
		// masih menggunakan radians
		System.out.println(Math.sin(90));
		System.out.println(Math.sin(Math.PI/2));
		
		System.out.println(Math.cos(60));
		System.out.println(Math.cos(Math.PI/3));
		
		System.out.println(Math.tan(45));
		System.out.println(Math.tan(Math.PI/4));
		
		// random = generate angka random dari 0 - 1
		System.out.println(Math.random()*3);
		
		// abs = absolute atau mutlak
		System.out.println(Math.abs(5));
	}

}
