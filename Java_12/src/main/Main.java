package main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import database.Database;

public class Main {

	Scanner scan = new Scanner(System.in);
//	Database db = new Database();
	Database db = Database.getInstance();
	
	public Main() {
//		login();
//		getAll();
//		insert();
//		update();
//		delete();
	}
	
	private void login() {
		System.out.print("Enter your username: ");
		String username = scan.nextLine();
		
		System.out.print("Enter your password: ");
		String password = scan.nextLine();
		
		String query = "select * from user where username = ? and password = ?";
		
		PreparedStatement preparedStatement;
		
		// Khusus untuk select kita bakal gunain executeQuery
		try {
			preparedStatement = db.preparedStatement(query);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				System.out.println("Login Berhasil");
			}else {
				System.out.println("Login Gagal");
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

	private void getAll() {
		String query = "select * from user";
		
		PreparedStatement preparedStatement;
		
		try {
			preparedStatement = db.preparedStatement(query);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				System.out.println("ID: " + resultSet.getInt("id"));
				System.out.println("username: " + resultSet.getString("username"));
				System.out.println("password: " + resultSet.getString("password"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

	private void insert() {
		System.out.print("Enter your username: ");
		String username = scan.nextLine();
		
		System.out.print("Enter your password: ");
		String password = scan.nextLine();
		
		String query = "insert into user (username, password) values (?, ?)";
		
		PreparedStatement preparedStatement;
		
		try {
			preparedStatement = db.preparedStatement(query);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			
			int row = preparedStatement.executeUpdate();
			
			if (row > 0) {
				System.out.println("Sign Up Berhasil");
			}else {
				System.out.println("Sign Up Gagal");
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
	
	private void update() {
		System.out.print("Enter your username: ");
		String username = scan.nextLine();
		
		System.out.print("Enter your password: ");
		String password = scan.nextLine();
		
		System.out.print("Enter your new password: ");
		String new_password = scan.nextLine();
		
		String query = "update user set password = ? where username = ? and password = ?";
		
		PreparedStatement preparedStatement;
		
		try {
			preparedStatement = db.preparedStatement(query);
			preparedStatement.setString(1, new_password);
			preparedStatement.setString(2, username);
			preparedStatement.setString(3, password);
			
			int row = preparedStatement.executeUpdate();
			
			if (row > 0) {
				System.out.println("Update Password Berhasil");
			}else {
				System.out.println("Update Password Gagal");
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
	
	private void delete() {
		System.out.print("Enter your username: ");
		String username = scan.nextLine();
		
		System.out.print("Enter your password: ");
		String password = scan.nextLine();
		
		String query = "delete from user where username = ? and password = ?";
		
		PreparedStatement preparedStatement;
		
		try {
			preparedStatement = db.preparedStatement(query);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			
			int row = preparedStatement.executeUpdate();
			
			if (row > 0) {
				System.out.println("Delete Berhasil");
			}else {
				System.out.println("Delete Gagal");
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
