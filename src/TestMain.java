import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by nickl on 02-10-2017.
 */
public class TestMain extends Application {
    public ReservationsScene reservationsScene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        Scene MainScene = reservationsScene.RScene();


        primaryStage.setTitle("Reservationer");


        primaryStage.setScene(MainScene);
        primaryStage.show();

    }
}
