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

/**
 * Clase principal de la aplicación JavaFX que inicializa y configura la ventana principal
 * de la aplicación MINI COOPER.
 */
public class HelloApplication extends Application {

    /**
     * Método de entrada de la aplicación. Se llama cuando la aplicación se inicia.
     *
     * @param primaryStage El escenario principal donde se muestra la interfaz de usuario.
     */
    @Override
    public void start(Stage primaryStage) {
        try {
            // Cargar el archivo FXML que define la interfaz de usuario
            AnchorPane root = FXMLLoader.load(getClass().getResource("/com/example/ejer_j/hello-view.fxml"));
            Scene scene = new Scene(root);

            // Cargar el ícono de la aplicación desde la ruta especificada
            Image icono = new Image(getClass().getResourceAsStream("/com/example/ejer_j/imagenes/Cooper.png"));
            primaryStage.getIcons().add(icono);

            // Cargar la imagen de fondo de la aplicación
            Image backgroundImage = new Image(getClass().getResourceAsStream("/com/example/ejer_j/imagenes/colores/fondoNegro.jpg"));
            BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, null, BackgroundSize.DEFAULT);
            Background backgroundWithImage = new Background(background);

            // Establecer la imagen de fondo en el AnchorPane
            root.setBackground(backgroundWithImage);

            // Configurar el escenario principal de la aplicación
            primaryStage.setScene(scene);
            primaryStage.setTitle("MINI COOPER");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace(); // Manejo de excepciones: imprimir la traza del error
        }
    }

    /**
     * Método principal que lanza la aplicación.
     *
     * @param args Argumentos de línea de comandos pasados a la aplicación.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
