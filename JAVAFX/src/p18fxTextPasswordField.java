import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class p18fxTextPasswordField extends Application {
	public static void main(String[] args) throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//creating text field and password field
		TextField name = new TextField();
		name.setMaxWidth(300);
		PasswordField pass = new PasswordField();
		pass.setMaxWidth(300);

		// defining layout and adding control
		VBox root = new VBox();
		root.getChildren().addAll(name, pass);

		// adding layout to a scene
		Scene scn = new Scene(root);

		// adding scene to the stage
		primaryStage.setScene(scn);
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.setTitle("Subham Panda Text and Password Field Stage");

		// displaying the stage
		primaryStage.show();
	}
}
