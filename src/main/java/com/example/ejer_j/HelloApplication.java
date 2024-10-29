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
            // Cambiamos la ruta del FXML al formato correcto
            AnchorPane root = FXMLLoader.load(getClass().getResource("/com/example/ejer_j/hello-view.fxml"));
            Scene scene = new Scene(root);

            // Cargar el ícono de la aplicación
            Image icono = new Image(getClass().getResourceAsStream("/com/example/ejer_j/imagenes/Cooper.png"));
            primaryStage.getIcons().add(icono);

            // Cargar la imagen de fondo
            Image backgroundImage = new Image(getClass().getResourceAsStream("/com/example/ejer_j/imagenes/colores/fondoNegro.jpg"));
            BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, null, BackgroundSize.DEFAULT);
            Background backgroundWithImage = new Background(background);

            // Establecer el fondo en el AnchorPane
            root.setBackground(backgroundWithImage);

            // Configurar la escena y mostrar la ventana
            primaryStage.setScene(scene);
            primaryStage.setTitle("MINI COOPER");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
