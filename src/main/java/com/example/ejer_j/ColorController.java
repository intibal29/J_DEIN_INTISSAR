package com.example.ejer_j;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class ColorController {

    @FXML
    private ImageView foto; // ImageView para mostrar el coche

    @FXML
    private ImageView luz; // ImageView para las luces del coche

    @FXML
    private ImageView imgLuzOff; // Icono para luces apagadas

    @FXML
    private ImageView imgLuzOn; // Icono para luces encendidas

    // Variable para controlar el estado de las luces (encendidas o apagadas)
    private boolean lucesEncendidas = false;

    // Métodos para cambiar el color del coche
    @FXML
    public void miniRojo() {
        cambiarColor("/com/example/ejer_j/imagenes/coches/miniBlazingRed.png");
    }

    @FXML
    public void miniAzul() {
        cambiarColor("/com/example/ejer_j/imagenes/coches/miniElectricBlue.png");
    }

    @FXML
    public void miniBlueMarin() {
        cambiarColor("/com/example/ejer_j/imagenes/coches/miniLapisluxuryBlue.png");
    }

    @FXML
    public void miniNegro() {
        cambiarColor("/com/example/ejer_j/imagenes/coches/miniMidnightBlack.png");
    }

    @FXML
    public void miniGrey() {
        cambiarColor("/com/example/ejer_j/imagenes/coches/miniMoonwalkGrey.png");
    }

    @FXML
    public void miniBiege() {
        cambiarColor("/com/example/ejer_j/imagenes/coches/miniPepperWhite.png");
    }

    @FXML
    public void miniMedioNegro() {
        cambiarColor("/com/example/ejer_j/imagenes/coches/miniThunderGray.png");
    }

    @FXML
    public void miniNaranja() {
        cambiarColor("/com/example/ejer_j/imagenes/coches/miniVolcaninOrange.png");
    }

    // Método para cambiar la imagen del coche
    private void cambiarColor(String rutaImagen) {
        Image imagenCoche = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/ejer_j/imagenes/autoLuz.png")));
        foto.setImage(imagenCoche);
    }

    // Métodos para alternar el estado de las luces
    @FXML
    public void imgLuzOffClicked() {
        // Si las luces están apagadas, encenderlas
        if (!lucesEncendidas) {
            lucesEncendidas = true;
            luz.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/ejer_j/imagenes/lucesOn.png"))));
            imgLuzOff.setVisible(false); // Esconder el botón de "luces apagadas"
            imgLuzOn.setVisible(true); // Mostrar el botón de "luces encendidas"
        }
    }

    @FXML
    public void imgLuzOnClicked() {
        // Si las luces están encendidas, apagarlas
        if (lucesEncendidas) {
            lucesEncendidas = false;
            luz.setImage(null); // Apagar las luces (sin imagen)
            imgLuzOn.setVisible(false); // Esconder el botón de "luces encendidas"
            imgLuzOff.setVisible(true); // Mostrar el botón de "luces apagadas"
        }
    }
}
