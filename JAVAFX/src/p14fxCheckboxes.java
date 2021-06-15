import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class p14fxCheckboxes extends Application {
	public static void main(String[] args) throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//creating check boxes
		CheckBox opt1 = new CheckBox("Option 1");
		CheckBox opt2 = new CheckBox("Option 2");
		CheckBox opt3 = new CheckBox("Option 3");
		CheckBox opt4 = new CheckBox("Option 4");

		// defining layout
		VBox root = new VBox();

		// adding control to layout
		root.getChildren().addAll(opt1, opt2, opt3, opt4);

		// adding layout to a scene
		Scene scn = new Scene(root);

		// adding scene to the stage
		primaryStage.setScene(scn);

		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.setTitle("Subham Panda CheckBoxes Stage");

		// displaying the stage
		primaryStage.show();
	}
}
