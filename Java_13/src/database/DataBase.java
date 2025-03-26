package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Furniture;
import model.FurnitureType;

public class DataBase {
	private String url = "jdbc:mysql://localhost:3306/sesi13";
	private String username = "root";
	private String password = "";
	
	private static Connection con;
	private static DataBase instance;
	
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	private DataBase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public PreparedStatement preparedStatement (String query) throws SQLException {
		return con.prepareStatement(query);
	}
	
	public static DataBase getInstance() {
		if (instance == null) {
			instance = new DataBase();
		}
		return instance;
	}
	
	public static ObservableList<Furniture> getAll(){
		String query = "select * from furniture";
		ObservableList<Furniture> furniturelist = FXCollections.observableArrayList();
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				furniturelist.add(new Furniture(rs.getString("id"), rs.getString("name"), getTypeById(rs.getInt("type_id")), rs.getInt("price")));
 			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return furniturelist;
	}
	
	public static FurnitureType getTypeById(int id) {
		String query = "select * from furniture_type where id = ?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			
			if (rs.next()) {
				return new FurnitureType(rs.getInt("id"), rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static ObservableList<FurnitureType> getAllType(){
		String query = "select * from furniture_type";
		ObservableList<FurnitureType> furniturelist = FXCollections.observableArrayList();
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				furniturelist.add(new FurnitureType(rs.getInt("id"), rs.getString("name")));
 			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return furniturelist;
	}
	
	public static void save(Furniture furniture) {
		String query = "insert into furniture values (?, ?, ?, ?)";
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, furniture.getId());
			ps.setString(2, furniture.getName());
			ps.setInt(3, furniture.getType().getId());
			ps.setInt(4, furniture.getPrice());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void delete(Furniture furniture) {
		String query = "delete from furniture where id = ?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, furniture.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void update(Furniture furniture) {
		String query = "update furniture set name = ?, type_id = ?, price = ? where id = ?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(4, furniture.getId());
			ps.setString(1, furniture.getName());
			ps.setInt(2, furniture.getType().getId());
			ps.setInt(3, furniture.getPrice());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
