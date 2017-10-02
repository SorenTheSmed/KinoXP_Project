package View;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Login {


    public Scene loginScene(Stage stage) {

        BorderPane bp = new BorderPane();

        Scene loginScene = new Scene(bp, 1600, 900);


        return loginScene;
    }

}
