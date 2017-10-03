package sample;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {


    GUIkassebooking gk = new GUIkassebooking();
    public void returnScene(Scene kassebooking, Stage primaryStage){
        gk.kasseBooking(primaryStage);
    }
}
