import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
// import java.io.*;

public class p10fx extends Application {
	public static void main(String[] args) throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// adding a button - i.e a control
		Button btn = new Button("Original Button Text");
		btn.setText("Button Text set using setText. This text is long in length and will span over multiple lines.");
		btn.setWrapText(true);

		// defining layout
		HBox root = new HBox();

		// adding control to layout
		root.getChildren().add(btn);


		// adding layout to a scene
		Scene scn = new Scene(root);

		// adding scene to the stage
		primaryStage.setScene(scn);

		primaryStage.setHeight(300);
		primaryStage.setWidth(300);
		primaryStage.setTitle("Subham Panda Button Stage");

		// displaying the stage
		primaryStage.show();
	}
}
