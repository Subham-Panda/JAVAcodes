import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class p25fx extends Application {
	public static void main(String[] args) throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label lblMain = new Label("Click on this label");
		Label lbl = new Label();
		lbl.setFont(new Font("Times New Roman", 32));
		lbl.setTextFill(Color.RED);
		lblMain.setOnMouseClicked(new EventHandler<Event>(){

			@Override
			public void handle(Event event) {
				lbl.setText("You have clicked on the label");				
			}
		});
		// defining layout and adding control
		VBox root = new VBox(lblMain,lbl);

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
