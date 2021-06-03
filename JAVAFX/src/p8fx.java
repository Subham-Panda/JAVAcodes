import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
// import java.io.*;

public class p8fx extends Application {
	public static void main(String[] args) throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// adding a label - i.e a control
		Label lbl = new Label("Original Label Text");
		lbl.setText("Label Text set using setText. This text is long in length and will span over multiple lines.");
		lbl.setTextFill(Color.RED);
		lbl.setFont(new Font("Times New Roman", 32));
		lbl.setTextAlignment(TextAlignment.CENTER);
		lbl.setWrapText(true);

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
		primaryStage.setTitle("Subham Panda Label Stage");

		// displaying the stage
		primaryStage.show();
	}
}
