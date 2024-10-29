module com.example.ejer_j {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejer_j to javafx.fxml;
    exports com.example.ejer_j;
}