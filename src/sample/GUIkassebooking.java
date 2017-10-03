package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Daniel on 02-10-2017.
 */
public class GUIkassebooking {

    public void kasseBooking(Stage primaryStage) {


        BorderPane backgroundKasse = new BorderPane();
        backgroundKasse.setPrefSize(1600, 900);


        HBox filmContainer = new HBox();

        Button tid1 = new Button("12:00");
        Button tid2 = new Button("14:30");
        Button tid3 = new Button("17:00");
        Button tid4 = new Button("19:00");
        Button tid5 = new Button("21:00");
        Button tid6 = new Button("23:30");

        HBox filmTid = new HBox();
        filmTid.getChildren().addAll(tid1, tid2, tid3, tid4, tid5, tid6);
        filmTid.setVisible(false);

        Button film1 = new Button("Star wars 1");
        film1.setOnAction(event -> {
            filmTid.setVisible(true);
        });
        Button film2 = new Button("Joakim der kommer til tiden");
        film2.setOnAction(event -> {
            filmTid.setVisible(true);
        });
        Button film3 = new Button("Karsecasper 2");
        film3.setOnAction(event -> {
            filmTid.setVisible(true);
        });

        Label sæde = new Label();
        Label række = new Label();
        VBox vboxForButtons = new VBox();
        for(int j = 1;j<11;j++) {
            HBox hboxForButtons = new HBox();
            Button row = new Button("Række: " +j);
             for (int i = 1; i < 11; i++) {
            Button btnNumber = new Button();
            btnNumber.setText(String.valueOf("Sæde " +i));
            btnNumber.setOnAction((ActionEvent) -> {
            sæde.setText(btnNumber.getText());
            række.setText(row.getText());
            });
                 //hboxForButtons.getChildren().add(row);

                 hboxForButtons.getChildren().add(btnNumber);
             }

             vboxForButtons.getChildren().add(row);
            vboxForButtons.getChildren().add(hboxForButtons);
         }


        Label navn = new Label("Navn: ");
        Label nummer = new Label("Nummer: ");
        Label adresse = new Label("Adresse: ");
        Label email = new Label("Email: ");

        TextField textNavn = new TextField();
        textNavn.setPromptText("Navn");
        TextField textNummer = new TextField();
        textNummer.setPromptText("Nummer");
        TextField textAdresse = new TextField();
        textAdresse.setPromptText("Adresse");
        TextField textEmail = new TextField();
        textEmail.setPromptText("Email");

        VBox vboxNavn = new VBox();
        vboxNavn.getChildren().addAll(navn,textNavn);
        VBox vboxNummer = new VBox();
        vboxNummer.getChildren().addAll(nummer,textNummer);
        VBox vboxAdresse = new VBox();
        vboxAdresse.getChildren().addAll(adresse,textAdresse);
        VBox vboxEmail = new VBox();
        vboxEmail.getChildren().addAll(email,textEmail);
        Button tilføj = new Button("Køb");


        HBox hboxFields = new HBox();
        hboxFields.getChildren().addAll(vboxNavn,vboxNummer,vboxAdresse,vboxEmail,række,sæde,tilføj);

        hboxFields.setVisible(false);





        filmContainer.getChildren().addAll(film1,film2,film3);

        vboxForButtons.setVisible(false);

        tid1.setOnAction(event -> {vboxForButtons.setVisible(true);
        hboxFields.setVisible(true);
        });
        tid2.setOnAction(event -> {vboxForButtons.setVisible(true);
            hboxFields.setVisible(true);});
        tid3.setOnAction(event -> {vboxForButtons.setVisible(true);
            hboxFields.setVisible(true);});
        tid4.setOnAction(event -> {vboxForButtons.setVisible(true);
            hboxFields.setVisible(true);});
        tid5.setOnAction(event -> {vboxForButtons.setVisible(true);
            hboxFields.setVisible(true);});
        tid6.setOnAction(event -> {vboxForButtons.setVisible(true);
            hboxFields.setVisible(true);});

        tilføj.setOnAction(event -> {vboxForButtons.setVisible(false);
            hboxFields.setVisible(false);
            filmTid.setVisible(false);
            sæde.setText("");
            række.setText("");
        });

        VBox tid = new VBox();
        tid.getChildren().addAll(filmContainer,filmTid,vboxForButtons,hboxFields);
        backgroundKasse.setCenter(tid);
        Scene kasseBooking = new Scene(backgroundKasse);


        primaryStage.setScene(kasseBooking);
        primaryStage.show();

    }

}
