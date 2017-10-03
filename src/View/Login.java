package view;

import controller.Controller;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.User;


public class Login {


    // Controller class instance
    Controller controller = new Controller();



    public Scene loginScene(Stage stage) {

        GridPane gp = new GridPane();
        gp.setHgap(10);
        gp.setVgap(10);

        Label login = new Label("Login");
        login.setId("loginLabel");
        Label email = new Label("E-mail");
        Label password = new Label("Password");

        TextField emailText = new TextField();
        emailText.setPromptText("E-mail");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("********");

        Button loginButton = new Button("Login");
        Label or = new Label("or");
        or.setAlignment(Pos.CENTER_RIGHT);
        Button signUpButton = new Button("Sign up");

        gp.add(login,2,1);
        gp.add(email, 1,2);
        gp.add(emailText, 2,2);
        gp.add(password,1,3);
        gp.add(passwordField,2,3);
        gp.add(loginButton,1,4,2,1);
        gp.add(or,2,5);
        gp.add(signUpButton, 1,6,2,1);
        gp.setAlignment(Pos.CENTER);
        GridPane.setMargin(or, new Insets(0,0,0,45));
        GridPane.setMargin(login, new Insets(0,0,0,30));


        Scene loginScene = new Scene(gp, 400, 250);
        loginScene.getStylesheets().add("view/css/loginStylesheet.css");


        /*
        Events
         */

        loginButton.setOnAction(event -> {
            try {
                User user = new User(emailText.getText(), passwordField.getText());
                controller.loginButtonPressed(stage, user);
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        signUpButton.setOnAction(event -> controller.signUpButtonPressed());

        return loginScene;
    }


}
