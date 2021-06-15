import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class p20fxButtonClickAction extends Application {
	public static void main(String[] args) throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn = new Button("Click here");
		Label lbl = new Label();
		
		btn.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				lbl.setText("You have clicked the button");
			}	
		});

		VBox root = new VBox();
		root.getChildren().addAll(btn, lbl);
		Scene scn = new Scene(root);
		primaryStage.setScene(scn);
		primaryStage.setWidth(500);
		primaryStage.setHeight(500);
		primaryStage.setTitle("Subham Panda Button Event Stage");
		primaryStage.show();
	}
}
