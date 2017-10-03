package controller;

import view.Login;
import javafx.application.Application;
import javafx.stage.Stage;

public class HomeController extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        try {

            Login login = new Login();

            stage.setTitle("Login");
            stage.setScene(login.loginScene(stage));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
