import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class p22fxActionWithRadioButtons extends Application {
	public static void main(String[] args) throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ToggleGroup group = new ToggleGroup();
		RadioButton opt1 = new RadioButton("Option 1 - Correct answer");
		RadioButton opt2 = new RadioButton("Option 2 - Wrong answer");
		RadioButton opt3 = new RadioButton("Option 3 - Wrong Answer");
		RadioButton opt4 = new RadioButton("Option 4 - Wrong Answer");
		Button btn = new Button("SUBMIT");
		Label lbl = new Label();
		opt1.setToggleGroup(group);
		opt2.setToggleGroup(group);
		opt3.setToggleGroup(group);
		opt4.setToggleGroup(group);

		btn.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				if (opt1.isSelected()) {
					lbl.setText("You have selected the correct answer: " + opt1.getText());
				} else if (!opt1.isSelected() && !opt2.isSelected() && !opt3.isSelected() && !opt4.isSelected()) {
					lbl.setText("Select some answer");
				} else {
					lbl.setText("You have selected the wrong answer");
				}		
			}
		});

		// defining layout
		VBox root = new VBox();

		// adding control to layout
		root.getChildren().addAll(opt1, opt2, opt3, opt4, btn, lbl);

		// adding layout to a scene
		Scene scn = new Scene(root);

		// adding scene to the stage
		primaryStage.setScene(scn);

		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.setTitle("Subham Panda Radio Buttons Stage");

		// displaying the stage
		primaryStage.show();
	}
}
