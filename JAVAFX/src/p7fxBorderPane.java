import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
// import java.io.*;

public class p7fxBorderPane extends Application {
	public static void main(String[] args) throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// adding a button - i.e a control
		Button btn1 = new Button("SET BOTTOM");
		Button btn2 = new Button("SET CENTER");
		Button btn3 = new Button("SET LEFT");
		Button btn4 = new Button("SET TOP");
		Button btn5 = new Button("SET RIGHT");

		// defining layout
		BorderPane root = new BorderPane();

		// adding control to layout
		root.setBottom(btn1);
		root.setCenter(btn2);
		root.setLeft(btn3);
		root.setTop(btn4);
		root.setRight(btn5);


		// adding layout to a scene
		Scene scn = new Scene(root);

		// adding scene to the stage
		primaryStage.setScene(scn);

		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.setTitle("Subham Panda BorderPane Stage");

		// displaying the stage
		primaryStage.show();
	}
}
