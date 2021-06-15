import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class p23fxActionWithCheckboxes extends Application {
	public static void main(String[] args) throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		CheckBox opt1 = new CheckBox("Option 1");
		CheckBox opt2 = new CheckBox("Option 2");
		CheckBox opt3 = new CheckBox("Option 3");
		CheckBox opt4 = new CheckBox("Option 4");
		Button btn = new Button("SUBMIT");
		Label lbl = new Label();
		btn.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				String selectedText = "";
				if (opt1.isSelected()) {
					selectedText += opt1.getText() + " ";
				}
				if (opt2.isSelected()) {
					selectedText += opt2.getText() + " ";
				} 
				if (opt3.isSelected()) {
					selectedText += opt3.getText() + " ";
				}
				if (opt4.isSelected()) {
					selectedText += opt4.getText() + " ";
				}
				if (selectedText.isEmpty()) {
					lbl.setText("Please select some option");
				} else {
					lbl.setText("You have selected: "+selectedText);
				}
			}
		});

		// defining layout
		VBox root = new VBox();

		// adding control to layout
		root.getChildren().addAll(opt1, opt2, opt3, opt4,btn,lbl);

		// adding layout to a scene
		Scene scn = new Scene(root);

		// adding scene to the stage
		primaryStage.setScene(scn);

		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.setTitle("Subham Panda CheckBoxes Stage");

		// displaying the stage
		primaryStage.show();
	}
}
