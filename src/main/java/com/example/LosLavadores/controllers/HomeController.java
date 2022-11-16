package com.example.LosLavadores.controllers;


import com.example.LosLavadores.dao.SQLiteDao;
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
    Button btn_Register;
    @FXML
    Button btn_Salary;
    @FXML
    Button btn_List;
    @FXML
    Button btn_Deposit;
    @FXML
    Button btn_Withdraw;
    @FXML
    Button btn_Create;



    @FXML
    Label label_Count;

    @FXML
    protected void onCreateAccountClick() throws Exception {
        SQLiteDao sqlite = new SQLiteDao();
        Connection connection = sqlite.getConnection();

        Parent registerScene = FXMLLoader.load(LosLavadoresApplication.class.getResource("createAccount.fxml"));
        Stage window = (Stage) btn_Create.getScene().getWindow();
        window.setScene(new Scene(registerScene));
    }

    @FXML
    protected void onSalaryClick() throws Exception {
        SQLiteDao sqlite = new SQLiteDao();
        Connection connection = sqlite.getConnection();

        Parent registerScene = FXMLLoader.load(LosLavadoresApplication.class.getResource("balance.fxml"));
        Stage window = (Stage) btn_Salary.getScene().getWindow();
        window.setScene(new Scene(registerScene));
    }

    @FXML
    protected void onListClick() throws Exception {
        SQLiteDao sqlite = new SQLiteDao();
        Connection connection = sqlite.getConnection();

        Parent registerScene = FXMLLoader.load(LosLavadoresApplication.class.getResource("clientList.fxml"));
        Stage window = (Stage) btn_List.getScene().getWindow();
        window.setScene(new Scene(registerScene));
    }

    @FXML
    protected void onDepositClick() throws Exception {
        SQLiteDao sqlite = new SQLiteDao();
        Connection connection = sqlite.getConnection();

        Parent registerScene = FXMLLoader.load(LosLavadoresApplication.class.getResource("deposit.fxml"));
        Stage window = (Stage) btn_Deposit.getScene().getWindow();
        window.setScene(new Scene(registerScene));
    }

    @FXML
    protected void onWithdrawClick() throws Exception {
        SQLiteDao sqlite = new SQLiteDao();
        Connection connection = sqlite.getConnection();

        Parent registerScene = FXMLLoader.load(LosLavadoresApplication.class.getResource("withdraw.fxml"));
        Stage window = (Stage) btn_Withdraw.getScene().getWindow();
        window.setScene(new Scene(registerScene));
    }

    @FXML
    protected void onRegisterClick() throws Exception {
        SQLiteDao sqlite = new SQLiteDao();
        Connection connection = sqlite.getConnection();

        Parent registerScene = FXMLLoader.load(LosLavadoresApplication.class.getResource("clientRegistration.fxml"));
        Stage window = (Stage) btn_Register.getScene().getWindow();
        window.setScene(new Scene(registerScene));
    }

}
