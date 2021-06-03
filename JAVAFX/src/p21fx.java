import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class p21fx extends Application {
	public static void main(String[] args) throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextField name = new TextField();
		name.setMaxWidth(300);
		Button btn = new Button("SUBMIT");
		Label lbl = new Label();

		btn.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				if (name.getText().isEmpty()) {
					lbl.setText("Please enter some name");
				} else {
					lbl.setText("Welcome Mr."+name.getText());
				}
			}
			
		});

		// defining layout and adding control
		VBox root = new VBox();
		root.getChildren().addAll(name,btn,lbl);

		// adding layout to a scene
		Scene scn = new Scene(root);

		// adding scene to the stage
		primaryStage.setScene(scn);
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.setTitle("Subham Panda Text and Field Stage");

		// displaying the stage
		primaryStage.show();
	}
}
