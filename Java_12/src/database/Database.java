package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database {
	private String url = "jdbc:mysql://localhost:3306/sesi12";
	private String username = "root";
	private String password = "";
	
	private Connection con;
	private static Database instance;
	
	private Database() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public PreparedStatement preparedStatement(String query) throws SQLException {
		return con.prepareStatement(query);
	}
	
	public static Database getInstance() {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}
}
