package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	ArrayList<Song> song = new ArrayList<Song>();
	String path = "Song List.txt";
	File file = new File(path);

	public Main() {

		int choice = 0;
		try {
			if (file.createNewFile()) {
				System.out.println("Successfully created " + file.getName());
			} else {
				fillList();
				System.out.println("File " + file.getName() + " already exist!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		do {
			System.out.println("Spotipai");
			System.out.println("1. Add Song");
			System.out.println("2. View Song");
			System.out.println("3. Search Song");
			System.out.println("4. Delete Song");
			System.out.println("5. Exit");
			System.out.print(">> ");

			try {
				choice = scan.nextInt();
			} catch (Exception e) {
				System.err.println("Please input integer!");
			}
			scan.nextLine();

			switch (choice) {
			case 1: {
				addSong();
				pressEnter();
				break;
			}
			case 2: {
				viewSong();
				pressEnter();
				break;
			}
			case 3: {
				searchSong();
				pressEnter();
				break;
			}
			case 4: {
				deleteSong();
				pressEnter();
				break;
			}
			case 5: {
				System.out.println("Bye bye T^T");
				file.delete();
				System.exit(0);
			}
			default:
			}
		} while (choice != 5);
	}

	public void addSong() {
		System.out.print("Input Song title: ");
		String title = scan.nextLine();
		song.add(new Song(title));

		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(title + "\n");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void viewSong() {
		try {
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String firstLine = bf.readLine();
			if (firstLine == null) {
				System.out.println("File is empty");
				bf.close();
				return;
			}

			System.out.println("Song List: ");
			System.out.println("- " + firstLine);

			String line;
			while ((line = bf.readLine()) != null) {
				System.out.println("- " + line);
				;
			}
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchSong() {
		viewSong();
		System.out.print("Song title: ");
		String title = scan.nextLine();
		Boolean cek = true;
		String lines;

		BufferedReader bf;
		try {
			bf = new BufferedReader(new FileReader(file));
			while ((lines = bf.readLine()) != null) {
				if (lines.equalsIgnoreCase(title)) {
					System.out.println("Song found: " + lines);
					cek = false;
				}
			}
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (cek)
			System.out.println("Song is not found");
	}

	public void deleteSong() {
		viewSong();
		System.out.print("Song's title that want to delete: ");
		String title = scan.nextLine();
		Boolean cek = true;

		for (int i = 0; i < song.size(); i++) {
			if (song.get(i).getTitle().equalsIgnoreCase(title)) {
				String temp = song.get(i).getTitle();
				song.remove(i);
				cek = false;
				System.out.println(temp + " deleted successfully!");
			}
		}

		try {
			FileWriter fw = new FileWriter(file);
			for (Song lagu : song) {
				fw.write(lagu.getTitle() + " \n");
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (cek)
			System.out.println("Song not found!");
	}
	
	public void fillList() {
		String lines;
		BufferedReader bf;
		try {
			bf = new BufferedReader(new FileReader(file));
			while ((lines = bf.readLine()) != null) {
				song.add(new Song(lines));
			}
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void pressEnter() {
		System.out.println("Press enter to continue...");
		scan.nextLine();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
