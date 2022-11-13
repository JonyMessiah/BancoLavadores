module com.example.loslavadores {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.LosLavadores to javafx.fxml;
    exports com.example.LosLavadores;
    exports com.example.LosLavadores.controllers;
    opens com.example.LosLavadores.controllers to javafx.fxml;
}