package com.example.LosLavadores.controllers;


import com.example.LosLavadores.LosLavadoresApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HomeController {

    @FXML
    Button btn_AddProject;

    @FXML
    Label label_Count;
    @FXML
    public void initialize() throws Exception {
        SQLiteDao sqlite = new SQLiteDao();
        Connection connection = sqlite.getConnection();

        String query = "SELECT COUNT(*) AS recordCount FROM projects WHERE  user_id = ?";

        PreparedStatement pstmt  = connection.prepareStatement(query);
        pstmt.setInt(1, LosLavadoresApplication.user_id);
        ResultSet rs    = pstmt.executeQuery();
        rs.next();
        Integer total_projects = rs.getInt("recordCount");

    }
    @FXML
    protected void onCreateAccountClick() throws Exception {
        SQLiteDao sqlite = new SQLiteDao();
        Connection connection = sqlite.getConnection();

        Parent registerScene = FXMLLoader.load(LosLavadoresApplication.class.getResource("createAccount.fxml"));
        Stage window = (Stage) btn_AddProject.getScene().getWindow();
        window.setScene(new Scene(registerScene));
    }
}
