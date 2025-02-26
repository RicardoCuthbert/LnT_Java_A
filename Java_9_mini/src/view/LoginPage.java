package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginPage {

	private GridPane root;
	private Scene scene;
	private Stage stage;
	private Label usernameLabel;
	private Label passwordLabel;
	private Label headerLabel;
	private TextField usernameField;
	private PasswordField passwordField;
	private Button loginButton;
	

	public LoginPage(Stage stage) {
		super();
		this.stage = stage;
		
		this.init();
		this.setComponent();
		this.setStyle();
	}
	
	private void init() {
		root =  new GridPane();
		scene = new Scene(root, 500, 500);
		headerLabel = new Label("Welcome!");
		usernameLabel = new Label("Username");
		passwordLabel = new Label("Password");
		usernameField = new TextField();
		passwordField = new PasswordField();
		loginButton = new Button("Sign in");
	}
	
	private void setComponent() {
		root.add(headerLabel, 0, 0, 2, 1);
		root.add(usernameLabel, 0, 1);
		root.add(passwordLabel, 0, 2);
		root.add(usernameField, 1, 1);
		root.add(passwordField, 1, 2);
		root.add(loginButton, 1, 3);
		
		stage.setResizable(false);
		stage.setScene(scene);
	}
	
	private void setStyle() {
		root.setAlignment(Pos.CENTER);
		root.setHgap(20);
		root.setVgap(20);
		
		headerLabel.setStyle("-fx-font-size: 40; -fx-font-family: 'Lexend'");
		
		loginButton.setMaxWidth(Double.MAX_VALUE);
		
		usernameField.setPromptText("Enter Username");
		passwordField.setPromptText("Enter Password");
	}

}
