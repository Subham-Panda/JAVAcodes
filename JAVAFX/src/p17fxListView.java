import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class p17fxListView extends Application {
	public static void main(String[] args) throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//creating list view
		ListView<String> options = new ListView<String>();
		options.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		options.getItems().add("Option 1");
		options.getItems().add("Option 2");
		options.getItems().add("Option 3");
		options.getItems().add("Option 4");

		// defining layout and adding control
		VBox root = new VBox(options);

		// adding layout to a scene
		Scene scn = new Scene(root);

		// adding scene to the stage
		primaryStage.setScene(scn);
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.setTitle("Subham Panda List View Stage");

		// displaying the stage
		primaryStage.show();
	}
}
