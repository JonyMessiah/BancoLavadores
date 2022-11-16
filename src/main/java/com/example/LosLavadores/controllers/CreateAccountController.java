package com.example.LosLavadores.controllers;

import com.example.LosLavadores.LosLavadoresApplication;
import com.example.LosLavadores.dao.SQLiteDao;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.sql.Connection;

public class CreateAccountController {

    @FXML
    Button btn_Menu;
    @FXML
    protected void onHomeClick() throws Exception {
        SQLiteDao sqlite = new SQLiteDao();
        Connection connection = sqlite.getConnection();

        Parent registerScene = FXMLLoader.load(LosLavadoresApplication.class.getResource("Home.fxml"));
        Stage window = (Stage) btn_Menu.getScene().getWindow();
        window.setScene(new Scene(registerScene));
    }
}
