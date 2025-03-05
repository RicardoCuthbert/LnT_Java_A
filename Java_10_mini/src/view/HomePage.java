package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomePage {
	// 1
	private Stage stage;
	private BorderPane root = new BorderPane();
	private Scene scene = new Scene(root, 500, 500);
	private VBox vbox = new VBox();
	
	// 2
	private MenuBar menuBar = new MenuBar();
	private Menu menu = new Menu("File");
	private MenuItem mt1 = new Menu("New");
	private MenuItem mt2 = new Menu("Exit");
	
	// 3 
	private Label name = new Label("Name");
	private TextField nametf = new TextField();
	private Label pass = new Label("Password");
	private PasswordField passtf = new PasswordField();
	
	// 4
	private Stage newWindow = new Stage();
	private VBox newRoot = new VBox();
	private Scene newScene = new Scene(newRoot, 300, 400);
	private Label eventName = new Label("Meet and Great Dahyun Twice!");
	private Label eventDate = new Label("Date: 11 - Feb - 2024");
	private Label eventLoc = new Label("Location: CGV Grand Indonesia");
	
	// 5
	private Label listLabel = new Label("Position avail");
	private ListView<String> listView = new ListView<String>();
	
	// 6 
	private Label rbLabel = new Label("Gender: ");
	private RadioButton rb1 = new RadioButton("Female");
	private RadioButton rb2 = new RadioButton("Male");
	private ToggleGroup tg = new ToggleGroup();
	
	// 7
	private Label cmbLabel = new Label("Insrt your position: ");
	private ComboBox<String> comboBox = new ComboBox<String>();
	
	// 8
	private CheckBox checkBox = new CheckBox("I agree to the terms and services");
	
	// 9 
	private Label ageLabel = new Label("Insert your age: ");
	private Spinner<Integer> age = new Spinner<Integer>();
	
	
	// 10
	private Button button = new Button("Submit");
	
	// 11 
	private Label taLabel = new Label("Your wish to meet Dahyun: ");
	private TextArea ta = new TextArea();

	public HomePage(Stage stage) {
		super();
		this.stage = stage;
		this.setComponents();
	}

	private void setComponents() {
		menu.getItems().addAll(mt1, mt2);
		menuBar.getMenus().add(menu);
		
		newRoot.getChildren().addAll(eventName, eventDate, eventLoc);
		newWindow.setScene(newScene);
		newWindow.setTitle("Dahyun Twice");
		newWindow.show();
		
		ObservableList<String> list = FXCollections.observableArrayList();
		list.add("Cat A");
		list.add("Cat B");
		list.add("Cat C");
		list.add("Cat D");
		list.add("Cat E");
		listView.setItems(list);
		listView.setMaxHeight(95);
		
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		
		comboBox.getItems().addAll(list);
		
		vbox.getChildren().addAll(menuBar, name, nametf, pass, passtf, listLabel, listView, rbLabel, rb1, rb2, cmbLabel, comboBox, ageLabel, age, taLabel, ta, button);
		root.setCenter(vbox);
		stage.setResizable(false);
		stage.setScene(scene);
	}
}
