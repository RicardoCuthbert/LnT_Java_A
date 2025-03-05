package main;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
//		BorderPane root = new BorderPane();
		VBox root = new VBox();
		Scene scene = new Scene(root, 500, 500);
//		root.setAlignment(Pos.CENTER);
		
		// Radio Button
//		RadioButton rb1 = new RadioButton("Female");
//		RadioButton rb2 = new RadioButton("Male");
//		
//		// Grouping
//		ToggleGroup tg = new ToggleGroup();
//		rb1.setToggleGroup(tg);
//		rb2.setToggleGroup(tg);
//		
//		root.getChildren().addAll(rb1, rb2);
		
		// Text Area
//		TextArea ta = new TextArea();
//		ta.setPrefSize(100, 100);
//		ta.setWrapText(true);
//		
//		root.getChildren().add(ta);
		
		// Combo Box
//		ArrayList<String> list = new ArrayList<String>();
//		ObservableList<String> obs_list = FXCollections.observableArrayList();
//		for (int i = 0; i < 30; i++) {
//			list.add("String ke-" + i);
//			obs_list.add("String ke-" + i);
//		}
//		
//		ComboBox<String> cb = new ComboBox<String>();
////		cb.getItems().addAll("jakarta", "bantung", "surabaya");
////		cb.getItems().addAll(list);
//		cb.getItems().addAll(obs_list);
////		cb.setItems(obs_list);
//		root.getChildren().add(cb);
		
		// Check Box
//		CheckBox cek1 = new CheckBox("I agree to the terms n services");
//		CheckBox cek2 = new CheckBox("Are you sure?");
//		
//		root.getChildren().addAll(cek1, cek2);
		
		// List View
//		ObservableList<String> obs_list = FXCollections.observableArrayList();
//		for (int i = 0; i < 30; i++) {
//			obs_list.add("String ke-" + i);
//		}
//		
//		ListView<String> listView = new ListView<String>();
//		listView.setItems(obs_list);
//		
//		root.getChildren().add(listView);
		
		// Spinner										(min, max, initial, increment)
//		Spinner<Integer> spinner = new Spinner<Integer>(0, 100, 1, 1);
//		root.getChildren().add(spinner);
		
		// Internal Frame
//		Stage newWindow = new Stage();
//		VBox newRoot = new VBox();
//		Scene newScene = new Scene(newRoot, 300, 400);
//		
//		Label newLabel = new Label("Ini internal Frame");
//		newRoot.getChildren().add(newLabel);
//		
//		newWindow.setScene(newScene);
//		newWindow.setTitle("Mini You");
//		newWindow.show();
		
		// Menu, MenuBar, MenuItems
		MenuBar menuBar = new MenuBar();
		
		Menu file = new Menu("File");
		MenuItem mt11 = new MenuItem("Open");
		MenuItem mt12 = new MenuItem("Save");
		MenuItem mt13 = new MenuItem("Exit");
		file.getItems().addAll(mt11, mt12, mt13);
		
		Menu edit = new Menu("Edit");
		MenuItem mt21 = new MenuItem("Cut");
		MenuItem mt22 = new MenuItem("Copy");
		MenuItem mt23 = new MenuItem("Paste");
		edit.getItems().addAll(mt21, mt22, mt23);
		
		menuBar.getMenus().addAll(file, edit);
		
		root.getChildren().add(menuBar);
		
		
		stage.setResizable(false);
		stage.setScene(scene);
		stage.setTitle("Session 10");
		stage.show();
	}

}
