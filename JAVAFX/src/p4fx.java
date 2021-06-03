import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
// import java.io.*;

public class p4fx extends Application {
    public static void main(String[] args) throws Exception {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //adding a button - i.e a control
		Button btn1 = new Button("CLICK 1");
        Button btn2 = new Button("CLICK 2");
        Button btn3 = new Button("CLICK 3");
        Button btn4 = new Button("CLICK 4");
        Button btn5 = new Button("CLICK 5");
        Button btn6 = new Button("CLICK 6");
        Button btn7 = new Button("CLICK 7");
        Button btn8 = new Button("CLICK 8");
        Button btn9 = new Button("CLICK 9");
		

        //defining layout
        VBox root = new VBox();
        root.setSpacing(20);
        //adding control to layout
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        root.getChildren().add(btn5);
        root.getChildren().add(btn6);
        root.getChildren().add(btn7);
        root.getChildren().add(btn8);
        root.getChildren().add(btn9);


        //adding layout to a scene
        Scene scn = new Scene(root);

		//adding scene to the stage
		primaryStage.setScene(scn);

		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.setTitle("Subham Panda VBox Stage");

        //displaying the stage
        primaryStage.show();
    }
}
