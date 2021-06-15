import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class p24fxActionWithComboBox extends Application {
	public static void main(String[] args) throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//creating combo box
		ComboBox<String> options = new ComboBox<String>();
		options.getItems().add("Option 1");
		options.getItems().add("Option 2");
		options.getItems().add("Option 3");
		options.getItems().add("Option 4");
		Button btn = new Button("SUBMIT");
		Label lbl = new Label();
		btn.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				if (options.getValue() == null) {
					lbl.setText("Please select an option");
				} else {
					lbl.setText("You have selected "+options.getValue());
				}
			}
		});
		// defining layout and adding control
		VBox root = new VBox(options,btn,lbl);

		// adding layout to a scene
		Scene scn = new Scene(root);

		// adding scene to the stage
		primaryStage.setScene(scn);
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.setTitle("Subham Panda Combo Box Stage");

		// displaying the stage
		primaryStage.show();
	}
}
