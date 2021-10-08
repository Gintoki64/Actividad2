import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 

public class IngresoUsuario extends Application {
	
	public static void main(String[] args) {
	// TODO Auto-generated constructor stub
		launch(args);
	
	}
	@Override
	public void start(Stage stage) throws Exception {
		stage.setScene(new Scene(createContent(),800,800));
	         
		stage.show();
		
	}
	private Parent createContent() {
		GridPane table = new GridPane();
		ColumnConstraints column1 = new ColumnConstraints();
		column1.setPercentWidth(50);
		ColumnConstraints column2 = new ColumnConstraints();
		column2.setPercentWidth(0);
		ColumnConstraints column3 = new ColumnConstraints();
		column3.setPercentWidth(50);
		ColumnConstraints column4=new ColumnConstraints();
		column4.setPercentWidth(20);
		table.getColumnConstraints().addAll(column1, column2,column3,column4);
		
		
		
		ListView<String> list = new ListView<String>();
		ObservableList<String> items =FXCollections.observableArrayList (
		    "Engineering", "MCA", "MBA", "Graduation","MTECH","Mphil","Phd");
		list.setItems(items);
		ListView<String> list2 = new ListView<String>();
		ObservableList<String> items2 =FXCollections.observableArrayList (
		    "Hyderabad", "Chennai", "Delhi", "Mumbai","Visiasfbjfn");
		list.setItems(items2);

		
		
		//Columna 1
		table.add(new Label("Nombre:"), 0, 0);
		table.add(new Label("Date of birth:"), 0, 1);
		table.add(new Label("Genero:"), 0, 2);
		table.add(new Label("Reservations:"), 0, 3);
		table.add(new Label("Tecnologia:"), 0, 4);
		table.add(new Label("Cualificacion:"), 0, 5);
		table.add(new Label("Location:"), 0, 6);
		//Columna 2
		table.add(new TextField(""), 2, 0);
		table.add(new DatePicker(), 2, 1);
		table.add(new RadioButton("Male"), 2, 2);
		table.add(new ToggleButton("Yes"), 2, 3);
		table.add(new CheckBox("Java"), 2, 4);
		table.add(new ListView(items), 2, 5);
		table.add(new ChoiceBox(items2), 2, 6);
		//Columna 3
		table.add(new RadioButton("Female"), 3, 2);
		table.add(new ToggleButton("No"), 3, 3);
		table.add(new CheckBox(".NET"), 3, 4);
		
		

		
		
		
		
		return table;
		}

}