package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		createFile();
//		writeFile();
//		readFile();
//		deleteFile();
		createDirectory();
	}
	
	public void createFile() {
//		String relativePath = "test.txt";
		String relativePath = "New Folder\\test.txt";
		
//		" \ " -> escape sequence (\n)
		String absolutePath = "C:\\Users\\Ricardo Cuthbert\\eclipse-workspace\\Java_8\\test.txt";
		
		File file = new File(relativePath);
		
		try {
			if(file.createNewFile()) {
				System.out.println("File " + file.getName() +" successfully created!");
			}else {
				System.out.println("File " + file.getName() + " already exists!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void writeFile() {
		String path = "test.txt";
		File file = new File(path);
		
		if(file.exists()) {
			System.out.println("File already exist! Overwriting file...");
		}else {
			System.out.println("Writing in new file");
		}
		
		try {
			FileWriter fw = new FileWriter(file); // Overwriting
//			FileWriter fw = new FileWriter(file, true); // Append
			
			
			fw.write("Hi nama saya Upin, dan ini adik saya Ipin\n" + "Betul Betul Betul\n");
//			fw.write("Hi nama saya Upin, dan ini adik saya Ipin");
//			fw.write("Betul Betul Betul");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readFile() {
		String path = "test.txt";
		try {
			BufferedReader bf = new BufferedReader(new FileReader(path));
//			String firstLine = bf.readLine();
//			System.out.println(firstLine);
			String lines;
			while((lines = bf.readLine()) != null) {
				System.out.println(lines);
			}
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteFile() {
		String path = "test.txt";
		File file = new File(path);
		if(file.delete()) {
			System.out.println("File deleted T^T");
		}else {
			System.out.println("Failed to delete file :D");
		}
	}
	
	public void createDirectory() {
//		String path = "New Folder\\Newer Folder\\Newest Folder";
		String path = "New Folder";
		File file = new File(path);
		if(file.mkdir()) {
			System.out.println("Successfully create folder in: " + file.getAbsolutePath());
		}else {
			System.out.println("Directory already exist!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
