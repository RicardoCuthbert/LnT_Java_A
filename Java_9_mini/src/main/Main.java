package main;

import javafx.application.Application;
import javafx.stage.Stage;
import view.LoginPage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		new LoginPage(stage);
		stage.setTitle("Login Page Mini Project");
		stage.show();
	}

}
