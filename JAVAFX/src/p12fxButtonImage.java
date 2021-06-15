import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.*;

public class p12fxButtonImage extends Application {
	public static void main(String[] args) throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// adding a button - i.e a control
		FileInputStream input = new FileInputStream("/home/subham/Documents/WINSEM20-21/JAVA LAB/DA5/JAVAFX/src/java.png");
		Image img = new Image(input);
		ImageView imgview = new ImageView(img);
		Button btn = new Button("CLICK ME", imgview);
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
