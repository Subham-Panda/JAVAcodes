import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        registrationForm studentForm = new registrationForm();
        studentForm.showForm(primaryStage);
    }
}

class registrationForm {
    Label namelbl;
    TextField nametxt;
    Label passlbl;
    PasswordField passtxt;
    Label genderlbl;
    RadioButton opt1;
    RadioButton opt2;
    Label subjectlbl;
    CheckBox chk1;
    CheckBox chk2;
    CheckBox chk3;
    Label countrylbl;
    ComboBox<String> country;
    Button submit;
    Label errorlbl;

    public void showForm(Stage primaryStage) {
        namelbl = new Label("Enter your Name");
        nametxt = new TextField();
        passlbl = new Label("Enter your Password");
        passtxt = new PasswordField();
        genderlbl = new Label("Select your gender");
        ToggleGroup group = new ToggleGroup();
        opt1 = new RadioButton("Male");
        opt2 = new RadioButton("Female");
        opt1.setToggleGroup(group);
        opt2.setToggleGroup(group);
        subjectlbl = new Label("Select you favourite subjects");
        chk1 = new CheckBox("English");
        chk2 = new CheckBox("DBMS");
        chk3 = new CheckBox("Physics");
        countrylbl = new Label("Select your Country");
        country = new ComboBox<String>();
        country.getItems().add("India");
        country.getItems().add("US");
        country.getItems().add("UK");
        submit = new Button("submit");
        errorlbl = new Label();

        submit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                boolean connect = validate_form();
                if (connect) {
                    String gender = "";
                    if (opt1.isSelected()) {
                        gender = opt1.getText();
                    }
                    if (opt2.isSelected()) {
                        gender = opt2.getText();
                    }

                    String selectedSubjects = "";
                    if(chk1.isSelected()) {
                        selectedSubjects+=chk1.getText() + " ";
                    }
                    if(chk2.isSelected()) {
                        selectedSubjects+=chk2.getText() + " ";
                    }
                    if(chk3.isSelected()) {
                        selectedSubjects+=chk3.getText() + " ";
                    }
                    student s = new student(nametxt.getText(), passtxt.getText(), gender, selectedSubjects,
                            (String) country.getValue());
                    boolean result = s.insertStudentRecord();
                    if (result) {
                        errorlbl.setText("Record Inserted successfully");
                    } else {
                        errorlbl.setText("Error Inserting record into the DB");
                    }
                } else {
                    errorlbl.setTextFill(Color.RED);
                }
            }

        });

        GridPane root = new GridPane();
        root.add(namelbl, 0, 1);
        root.add(nametxt, 1, 1);
        root.add(passlbl, 0, 2);
        root.add(passtxt, 1, 2);
        root.add(genderlbl, 0, 3);
        root.add(opt1, 0, 4);
        root.add(opt2, 0, 5);
        root.add(subjectlbl, 0, 6);
        root.add(chk1, 0, 7);
        root.add(chk2, 0, 8);
        root.add(chk3, 0, 9);
        root.add(countrylbl, 0, 10);
        root.add(country, 0, 11);
        root.add(submit, 0, 12);
        root.add(errorlbl, 0, 13);
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.show();
    }
    
    public boolean validate_form() {
        boolean proceed = true;
        if (nametxt.getText().isEmpty() && proceed == true) {
            errorlbl.setText("Enter you Name");
            proceed = false;
        }
        if (passtxt.getText().isEmpty() && proceed == true) {
            errorlbl.setText("Enter you Password");
            proceed = false;
        }
        if (opt1.isSelected() == false && opt2.isSelected() == false && proceed == true) {
            errorlbl.setText("Select your gender");
            proceed = false;
        }
        if (chk1.isSelected() == false && chk2.isSelected() == false && chk3.isSelected() == false && proceed == true) {
            errorlbl.setText("Select your favourite subjects");
            proceed = false;
        }
        if (country.getValue() == null && proceed == true) {
            errorlbl.setText("Select your Country");
            proceed = false;
        }
        return proceed;
    }
}

class student {
    private String name;
    private String password;
    private String gender;
    private String subjects;
    private String country;

    public student(String name, String password, String gender, String subjects, String country) {
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.subjects = subjects;
        this.country = country;
    }

    public boolean insertStudentRecord() {
        try {
            dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/vitSubham", "guest", "guest123");
            Connection con = dbmsconnect.getConnection();
            String sql = "insert into students1 values (?,?,?,?,?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, password);
            stmt.setString(3, gender);
            stmt.setString(4, subjects);
            stmt.setString(5, country);
            int i = stmt.executeUpdate();
            dbmsconnect.closeConnection(con, stmt);
            if (i > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

class dbmsconnection {
	String url;
	String username;
	String password;

	public dbmsconnection(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection established successfully");
		return con;
	}

	public void closeConnection(Connection con, Statement stmt) throws SQLException {
		stmt.close();
		con.close();
		System.out.println("The connection is closed");
	}
}