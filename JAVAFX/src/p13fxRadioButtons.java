import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class p13fxRadioButtons extends Application {
	public static void main(String[] args) throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//creating toggle group
		ToggleGroup group = new ToggleGroup();
		RadioButton opt1 = new RadioButton("Option 1");
		RadioButton opt2 = new RadioButton("Option 2");
		RadioButton opt3 = new RadioButton("Option 3");
		RadioButton opt4 = new RadioButton("Option 4");
		opt1.setToggleGroup(group);
		opt2.setToggleGroup(group);
		opt3.setToggleGroup(group);
		opt4.setToggleGroup(group);

		// defining layout
		VBox root = new VBox();

		// adding control to layout
		root.getChildren().addAll(opt1, opt2, opt3, opt4);

		// adding layout to a scene
		Scene scn = new Scene(root);

		// adding scene to the stage
		primaryStage.setScene(scn);

		primaryStage.setHeight(300);
		primaryStage.setWidth(300);
		primaryStage.setTitle("Subham Panda Radio Buttons Stage");

		// displaying the stage
		primaryStage.show();
	}
}
