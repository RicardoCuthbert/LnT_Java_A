package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
//	int tes;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out, true);
//		int a = 10;
//		double b = 3.14;
//		String c = "Budi";
//		char d = 'd';
//		
//		Integer e = 10;
		
		// Arithmetic
//		int a = 10 + 5;
//		int b = 10 - 5;
//		int c = 10 * 5;
//		int d = 10 / 5;
//		int e = 10 % 5;
//		int f = 0;
//		int g = 2;
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
		
		// Relational
		// == , != , > , < , >= , <=
//		System.out.println((5 == 10));
//		System.out.println((5 != 10));
//		System.out.println((5 > 10));
//		System.out.println((5 < 10));
//		System.out.println((5 >= 10));
//		System.out.println((5 <= 10));
		
		// Bitwise
		// ~, | , & , << , >>
//		int a = 4; // 0100
//		int b = 8; // 1000
//		
//		System.out.println(a&b);
//		// 0100
//		// 1000
//		// => 0000
//		
//		System.out.println(a|b);
//		// 0100
//		// 1000
//		// => 1100
//		
//		System.out.println(~a);
//		// 00000000 00000000 00000000 00000100
//		// 11111111 11111111 11111111 11111011 ( - )
//		// 00000000 00000000 00000000 00000101 => 5
//		// -5
//		
//		System.out.println(a << 1);
//		// 0100
//		// 1000
//		
//		System.out.println(a >> 1);
//		// 0100
//		// 0010
		
		//Logical (&&, ||, !)
//		System.out.println((true && false));
//		System.out.println((true || false));
//		System.out.println((!true));
		
		// Selection
		// if, else if, else, switch case, ternary
		
//		if ( a > 10) {
//			System.out.println("Wow lebih besar dari 10");
//		}else if (a < 5) {
//			System.out.println("Wow lebih kecil dari 5");
//		}else {
//			System.out.println("Buangan");
//		}
		
//		switch (a) {
//		case 1: {
//			System.out.println("Ini angka 1");
//			break;
//		}
//		case 2: {
//			System.out.println("Ini angka 2");
//			break;
//		}
//		case 3: {
//			System.out.println("Ini angka 3");
//			break;
//		}
//		default:
//			System.out.println("Buangan");
//		}
		
//		int a = 10;
//		int b = 5;
//		System.out.println((a > b)? "angka a lebih gede" : "angka a lebih kecil");
		
		// Repetition
		// For, Do-While, While
//		for (int i = 1; i <= 3; i++) {
//			System.out.println("Hai aku budi");
//		}
		
		// ctrl + spacebar
//		int a = 2;
		
//		while (a < 2) {
//			System.out.println(a);
//			a++;
//		}
		
//		do {
//			System.out.println(a);
//			a++;
//		} while (a < 2);
		
		int a;
		do {
			a = 0;
			System.out.println("1. View");
			System.out.println("2. Add");
			System.out.println("3. Delete");
			System.out.println("4. Exit");
			a = scan.nextInt();
			scan.nextLine();
			
			switch (a) {
			case 1: {
				// Function View
				break;
			}case 2: {
				// Function Add
				break;
			}case 3: {
				// Function delete
				break;
			}case 4: {
				out.print("Thank you for using our services");
				break;
			}
			default:
				out.println("Invalid option! Please choose again");
			}
		} while (a != 4);
		out.close();
	}
}
