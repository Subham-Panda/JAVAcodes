import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
// import java.io.*;

public class p9fx extends Application {
	public static void main(String[] args) throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// adding a label - i.e a control
		FileInputStream input = new FileInputStream("/home/subham/Documents/WINSEM20-21/JAVA LAB/DA5/JAVAFX/src/java.png");
		Image img = new Image(input);
		ImageView imgview = new ImageView(img);
		Label lbl = new Label("Label With Image", imgview);

		// defining layout
		HBox root = new HBox();

		// adding control to layout
		root.getChildren().add(lbl);


		// adding layout to a scene
		Scene scn = new Scene(root);

		// adding scene to the stage
		primaryStage.setScene(scn);

		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.setTitle("Subham Panda Label with Image Stage");

		// displaying the stage
		primaryStage.show();
	}
}
