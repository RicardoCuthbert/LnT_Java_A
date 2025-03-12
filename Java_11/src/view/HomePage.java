package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Furniture;

public class HomePage {
	private Stage stage;
	private BorderPane root = new BorderPane();
	private Scene scene = new Scene(root, 1000, 700);
	
	private Label header_label = new Label("Add new furniture");
	private Label id_label = new Label("Furniture's ID");
	private Label name_label = new Label("Furniture's Name");
	private Label type_label = new Label("Furniture's Type");
	private Label price_label = new Label("Furniture's Price");
	
	private TextField id_tf = new TextField();
	private TextField name_tf = new TextField();
	private TextField price_tf = new TextField();
	private ComboBox<String> type_cb = new ComboBox<String>();
	
	private Button button = new Button("Add new furniture");
	
	private TableView<Furniture> table = new TableView<Furniture>();
	
	private TableColumn<Furniture, String> id_col = new TableColumn<Furniture, String>("Furniture's ID");
	private TableColumn<Furniture, String> name_col = new TableColumn<Furniture, String>("Furniture's name");
	private TableColumn<Furniture, String> type_col = new TableColumn<Furniture, String>("Furniture's type");
	private TableColumn<Furniture, Integer> price_col = new TableColumn<Furniture, Integer>("Furniture's price");
	
	private GridPane gp = new GridPane();
	
	private ObservableList<Furniture> list = FXCollections.observableArrayList();

	public HomePage(Stage stage) {
		this.stage = stage;
		
		this.init_furniture();
		this.populate_table();
		
		this.set_component();
		this.set_style();
		this.set_column();
		this.handle_button();
	}
	
	@SuppressWarnings("unchecked")
	private void set_component() {
		root.setTop(table);
		root.setCenter(gp);
		
		gp.add(header_label, 0, 0, 2, 1);
		gp.add(id_label, 0, 1);
		gp.add(name_label, 0, 2);
		gp.add(type_label, 0, 3);
		gp.add(price_label, 0, 4);
		gp.add(id_tf, 1, 1);
		gp.add(name_tf, 1, 2);
		gp.add(type_cb, 1, 3);
		gp.add(price_tf, 1, 4);
		gp.add(button, 0, 5, 2, 1);
		
		table.getColumns().addAll(id_col, name_col, type_col, price_col);
		
		stage.setResizable(false);
		stage.setScene(scene);
	}
	
	private void set_style() {
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(15);
		gp.setVgap(15);
		
		GridPane.setHalignment(header_label, HPos.CENTER);
		GridPane.setHalignment(button, HPos.CENTER);
		
		type_cb.setMaxWidth(Double.MAX_VALUE);
		
		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY_ALL_COLUMNS);
		
		type_cb.getItems().addAll("Chair", "Table", "Wardrobe");
	}
	
	private void set_column() {
		id_col.setCellValueFactory(new PropertyValueFactory<Furniture, String>("id"));
		name_col.setCellValueFactory(new PropertyValueFactory<Furniture, String>("name"));
		type_col.setCellValueFactory(new PropertyValueFactory<Furniture, String>("type"));
		price_col.setCellValueFactory(new PropertyValueFactory<Furniture, Integer>("price"));
	}
	
	private void init_furniture() {
		list.add(new Furniture("FR001", "Wooden Chair", "Chair", 350000));
		list.add(new Furniture("FR002", "Iron Chair", "Chair", 550000));
		list.add(new Furniture("FR003", "Diamond Chair", "Chair", 950000));
		list.add(new Furniture("FR004", "Obsidian Table", "Table", 1050000));
		list.add(new Furniture("FR005", "Plastic Wardrobe", "Wardrobe", 150000));
		list.add(new Furniture("FR006", "Alumunium Table", "Table", 650000));
	}
	
	private void populate_table() {
		table.setItems(list);
		
		id_tf.clear();
		name_tf.clear();
		type_cb.getSelectionModel().clearSelection();
		price_tf.clear();
	}
	
	private void handle_button() {
		button.setOnAction(event -> {
			String id = id_tf.getText();
			String name = name_tf.getText();
			String type = type_cb.getSelectionModel().getSelectedItem();
			String price = price_tf.getText();
			Alert alert = new Alert(AlertType.ERROR);
			
			if (id.isEmpty() || name.isEmpty() || type_cb.getSelectionModel().isEmpty() || price.isEmpty()) {
				alert.initOwner(stage);
				alert.setTitle("Error");
				alert.setHeaderText("Validation Error");
				alert.setContentText("All fields must be filled!");
				alert.showAndWait();
				return;
			}
			
			for (Furniture furniture : list) {
				if(furniture.getId().equals(id)) {
					alert.initOwner(stage);
					alert.setTitle("Error");
					alert.setHeaderText("Validation Error");
					alert.setContentText("ID must be Unique!");
					alert.showAndWait();
					return;
				}
			}
			
			if (!id.startsWith("FR")) {
				alert.initOwner(stage);
				alert.setTitle("Error");
				alert.setHeaderText("Validation Error");
				alert.setContentText("ID MUST START WITH FR!");
				alert.showAndWait();
				return;
			}
			
			try {
				Integer.valueOf(price);
			} catch (Exception e) {
				alert.initOwner(stage);
				alert.setTitle("Error");
				alert.setHeaderText("Validation Error");
				alert.setContentText("Price must be Numeric!");
				alert.showAndWait();
				return;
			}
			
			if (Integer.valueOf(price) < 150000) {
				alert.initOwner(stage);
				alert.setTitle("Error");
				alert.setHeaderText("Validation Error");
				alert.setContentText("Price can't be lower than 150,000!");
				alert.showAndWait();
				return;
			}
			
			list.add(new Furniture(id, name, type, Integer.valueOf(price)));
			alert = new Alert(AlertType.INFORMATION);
			alert.initOwner(stage);
			alert.setTitle("Cool!");
			alert.setHeaderText("Info");
			alert.setContentText("Furniture added successfully!");
			alert.showAndWait();
			this.populate_table();
		});
	}
}
