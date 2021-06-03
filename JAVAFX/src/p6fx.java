import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
// import java.io.*;

public class p6fx extends Application {
	public static void main(String[] args) throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// adding a button - i.e a control
		Button btn1 = new Button("CLICK 1");
		Button btn2 = new Button("CLICK 2");
		Button btn3 = new Button("CLICK 3");

		// defining layout
		GridPane root = new GridPane();

		// adding control to layout
		root.add(btn1, 0, 0);
		root.add(btn2, 1, 1);
		root.add(btn3, 2, 2);
		root.setGridLinesVisible(true);
		root.setHgap(20);
		root.setVgap(20);

		// adding layout to a scene
		Scene scn = new Scene(root);

		// adding scene to the stage
		primaryStage.setScene(scn);

		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.setTitle("Subham Panda GridPane Stage");

		// displaying the stage
		primaryStage.show();
	}
}
