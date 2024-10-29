package com.example.ejer_j;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BackgroundRepeat;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            AnchorPane root = FXMLLoader.load(getClass().getResource("/com/example/ejer_j/hello-view.fxml"));
            Scene scene = new Scene(root);

            Image icono = new Image(getClass().getResourceAsStream("/com/example/ejer_j/imagenes/Cooper.png"));
            primaryStage.getIcons().add(icono);

            Image backgroundImage = new Image(getClass().getResourceAsStream("/com/example/ejer_j/imagenes/colores/fondoNegro.jpg"));
            BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, null, BackgroundSize.DEFAULT);
            Background backgroundWithImage = new Background(background);

            root.setBackground(backgroundWithImage);

            primaryStage.setScene(scene);
            primaryStage.setTitle("MINI COOPER");
            primaryStage.show();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
