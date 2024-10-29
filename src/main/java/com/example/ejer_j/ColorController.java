package com.example.ejer_j;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

/**
 * Controlador de la interfaz de usuario para la configuración de colores y luces
 * del coche MINI COOPER.
 */
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

    /**
     * Cambia el color del coche a rojo.
     */
    @FXML
    public void miniRojo() {
        cambiarColor("/com/example/ejer_j/imagenes/coches/miniBlazingRed.png");
    }

    /**
     * Cambia el color del coche a azul eléctrico.
     */
    @FXML
    public void miniAzul() {
        cambiarColor("/com/example/ejer_j/imagenes/coches/miniElectricBlue.png");
    }

    /**
     * Cambia el color del coche a azul lapislázuli.
     */
    @FXML
    public void miniBlueMarin() {
        cambiarColor("/com/example/ejer_j/imagenes/coches/miniLapisluxuryBlue.png");
    }

    /**
     * Cambia el color del coche a negro.
     */
    @FXML
    public void miniNegro() {
        cambiarColor("/com/example/ejer_j/imagenes/coches/miniMidnightBlack.png");
    }

    /**
     * Cambia el color del coche a gris.
     */
    @FXML
    public void miniGrey() {
        cambiarColor("/com/example/ejer_j/imagenes/coches/miniMoonwalkGrey.png");
    }

    /**
     * Cambia el color del coche a beige.
     */
    @FXML
    public void miniBiege() {
        cambiarColor("/com/example/ejer_j/imagenes/coches/miniPepperWhite.png");
    }

    /**
     * Cambia el color del coche a gris medio.
     */
    @FXML
    public void miniMedioNegro() {
        cambiarColor("/com/example/ejer_j/imagenes/coches/miniThunderGray.png");
    }

    /**
     * Cambia el color del coche a naranja.
     */
    @FXML
    public void miniNaranja() {
        cambiarColor("/com/example/ejer_j/imagenes/coches/miniVolcaninOrange.png");
    }

    /**
     * Cambia la imagen del coche a la que se especifica en la ruta dada.
     *
     * @param rutaImagen Ruta de la imagen que se va a establecer como el color del coche.
     */
    private void cambiarColor(String rutaImagen) {
        Image imagenCoche = new Image(Objects.requireNonNull(getClass().getResourceAsStream(rutaImagen)));
        foto.setImage(imagenCoche);
    }

    /**
     * Maneja el evento de clic en la imagen de luces apagadas.
     * Cambia el estado a luces encendidas y actualiza las imágenes correspondientes.
     */
    @FXML
    public void imgLuzOffClicked() {
        System.out.println("imgLuzOffClicked() fue llamado");
        if (!lucesEncendidas) {
            lucesEncendidas = true;

            // Cambiar la imagen del coche a las luces encendidas
            luz.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/ejer_j/imagenes/autoLuz.png"))));
            luz.setVisible(true); // Hacer visible la imagen de autoLuz

            // Actualizar la visibilidad de las imágenes de luces
            imgLuzOff.setVisible(false); // Esconder el botón de "luces apagadas"
            imgLuzOn.setVisible(true); // Mostrar el botón de "luces encendidas"
        }
    }

    /**
     * Maneja el evento de clic en la imagen de luces encendidas.
     * Cambia el estado a luces apagadas y actualiza las imágenes correspondientes.
     */
    @FXML
    public void imgLuzOnClicked() {
        System.out.println("imgLuzOnClicked() fue llamado");
        if (lucesEncendidas) {
            lucesEncendidas = false;

            // Cambiar la imagen del coche a las luces apagadas
            luz.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/ejer_j/imagenes/luzApagada.png"))));
            luz.setVisible(false); // Esconder la imagen de autoLuz

            // Actualizar la visibilidad de las imágenes de luces
            imgLuzOn.setVisible(false); // Esconder el botón de "luces encendidas"
            imgLuzOff.setVisible(true); // Mostrar el botón de "luces apagadas"
        }
    }
}
