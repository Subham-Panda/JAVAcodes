import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
// import java.io.*;

public class p1fxAddingControl extends Application {
    public static void main(String[] args) throws Exception {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //adding a button - i.e a control
        Button btn = new Button("CLICK ME");

        //defining layout
        HBox root = new HBox();

        //adding control to layout
        root.getChildren().add(btn);

        //adding layout to a scene
        Scene scn = new Scene(root);

        //adding scene to the stage
        primaryStage.setScene(scn);

        //displaying the stage
        primaryStage.show();
    }
}
