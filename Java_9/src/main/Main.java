package main;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.LightBase;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

@SuppressWarnings("unused")
public class Main extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
//		BorderPane root = new BorderPane();
//		Label label = new Label("Hi Dunia");
//		root.setCenter(label);
//		root.setLeft(new Button("Click me!"));
		
//		GridPane = kita bakal ngemasukin componentnya seperti titik coordinate
//		GridPane root = new GridPane();
//		root.add(new Label("HUHU"), 0, 0);
//		root.add(new Label("Batagor"), 1, 1);
//		root.add(new Label("Duolingo"), 1, 0);
		
//		VBox root = new VBox();
//		root.getChildren().addAll(new Label("HUHU"), new Label("Batagor"), new Label("Duolingo"));
//		for (int i = 0; i < 10; i++) {
//			root.getChildren().add(new Button("Button " + i));
//		}
		
//		HBox root = new HBox();
//		root.getChildren().addAll(new Label("HUHU"), new Label("Batagor"), new Label("Duolingo"));
//		for (int i = 0; i < 10; i++) {
//			root.getChildren().add(new Button("Button " + i));
//		}
		
		FlowPane root = new FlowPane();
		root.setOrientation(Orientation.VERTICAL);
		for (int i = 0; i < 20; i++) {
			root.getChildren().add(new Button("Button " + i));
		}
		
		Scene scene = new Scene(root, 400, 400);
		
//		stage.setResizable(false);
		stage.setScene(scene);
		stage.setTitle("Java - 9");
		stage.show();
	}

}
