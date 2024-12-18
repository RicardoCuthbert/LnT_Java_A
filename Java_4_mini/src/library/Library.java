package library;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> books = new ArrayList<Book>();
	
	public void addBooks(Book book) {
		books.add(book);
		
		System.out.println("==========================");
		System.out.println("Book added:");
		System.out.println("Title: " + book.title);
		System.out.println("Author: " + book.author);
		System.out.println("Genre: " + book.genre);
		System.out.println("==========================");
	}
	
	public void displayBooks() {
		if (books.isEmpty()) System.out.println("Library is empty");
		else {
			System.out.println("Books list: ");
			for (int i = 0; i < books.size(); i++) {
				System.out.println(i+1 + ". Book's title: " + books.get(i).title + "; Genre: " + books.get(i).genre + "; Author: " + books.get(i).author);
			}
		}
		
	}
	
	public void deleteBooks(int x) {
		String judul = books.get(x).title;
		books.remove(x);
		
		System.out.println("Book's title " + judul + " deleted succesfully!");
	}
}
