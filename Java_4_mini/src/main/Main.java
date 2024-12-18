package main;

import java.util.Scanner;

import library.Book;
import library.Library;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Scanner scan = new Scanner(System.in);
		Library library = new Library();

		int choice = 0;
		do {
			System.out.println("Menu:");
			System.out.println("1. Add book");
			System.out.println("2. Display book");
			System.out.println("3. Delete book");
			System.out.println("4. Exit");
			System.out.print(">> ");
			choice = scan.nextInt();
			scan.nextLine();

			switch (choice) {
			case 1: {
				String title;
				System.out.print("Please input book's title: ");
				title = scan.nextLine();

				String author;
				System.out.print("Please input book's author: ");
				author = scan.nextLine();

				String genre;
				System.out.print("Please input book's genre: ");
				genre = scan.nextLine();

				Book book = new Book(title, author, genre);
				library.addBooks(book);

				scan.nextLine();
				break;
			}
			case 2: {
				library.displayBooks();
				scan.nextLine();
				break;
			}
			case 3: {
				library.displayBooks();
				System.out.println("Please input the book's number: ");
				int pilih = scan.nextInt();
				scan.nextLine();
				library.deleteBooks(pilih-1);
				scan.nextLine();
				break;
			}
			case 4: {
				System.out.println("Thank you for using our services! :D");
				System.exit(0);
				break;
			}
			default:
				System.out.println("Masukin angka yang bener bro! :D");
				scan.nextLine();
				break;
			}

		} while (choice < 4 || choice > 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
