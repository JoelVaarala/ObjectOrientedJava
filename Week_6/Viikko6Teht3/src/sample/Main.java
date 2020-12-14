package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


        GridPane paneeli = new GridPane();
        paneeli.setAlignment(Pos.CENTER);
        paneeli.setPadding(new Insets(10,10,10,10));
        paneeli.setHgap(10);paneeli.setVgap(10);

        paneeli.add(new Label("Tuotteen nimi"), 0,0);
        paneeli.add(new TextField(), 1, 0);

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().add("Tietokone");
        choiceBox.getItems().add("Näyttö");
        choiceBox.getItems().add("Hiiri");
        choiceBox.setValue("Tietokone");

        paneeli.add(new Label("Valitse tuote"),0,1);
        paneeli.add(choiceBox, 1, 1);

        DatePicker dp = new DatePicker();
        paneeli.add(new Label("Käyttöönotto pvm"),0,2);
        paneeli.add(dp, 1, 2);

        paneeli.add(new Label("Myyntihinta"), 0,3);
        paneeli.add(new TextField(),1,3);

        paneeli.add(new Label("Myyjän nimi"),0,4);
        paneeli.add(new TextField(),1,4);

        paneeli.add(new Button("Tallenna"), 1,5);
        paneeli.add(new Button("Sulje"), 2,5);


        Scene canvas = new Scene(paneeli, 400, 300);
        primaryStage.getIcons().add(new Image("https://pbs.twimg.com/profile_images/579896709607735296/duJWAwqF.jpg"));
        primaryStage.setTitle("Savonia IT sales");
        primaryStage.setScene(canvas);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
