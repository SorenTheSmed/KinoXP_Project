package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Label kino = new Label("Kino");
        kino.setId("kino");



        GridPane backGround = new GridPane();
        backGround.setId("backGround");
        backGround.setPrefSize(1600,900);
        backGround.setVgap(10);
        backGround.setHgap(10);

        Scene ansatLogin = new Scene(backGround);
        ansatLogin.getStylesheets().add("sample/MyCSS.css");

        Label labelUsername = new Label("Username: ");
        labelUsername.setId("labelUsername");

        Label labelPassword = new Label("Password: ");
        labelPassword.setId("labelUsername");

        Button loginBtn = new Button("Login");
        loginBtn.setOnAction(event -> {

            Controller con = new Controller();
            con.returnScene(ansatLogin, primaryStage);

        });

        TextField textUsername = new TextField("Username");

        PasswordField textPassword = new PasswordField();

        VBox container = new VBox();

        container.getChildren().addAll(labelUsername,textUsername,labelPassword,textPassword,loginBtn);


        backGround.add(container,70,26);
        backGround.add(kino,70,25);


        primaryStage.setScene(ansatLogin);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
