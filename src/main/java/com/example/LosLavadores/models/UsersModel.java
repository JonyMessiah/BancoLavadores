package com.example.LosLavadores.models;
import java.util.*;


public class UsersModel {

    static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        UsersModel.name = name;
    }

    public static String getAge() {
        return age;
    }

    public static void setAge(String age) {
        UsersModel.age = age;
    }

    public static String getId() {
        return user_id;
    }

    public static void setId(String id) {
        UsersModel.user_id = id;
    }

    public static String getBirthDate() {
        return birthDate;
    }

    public static void setBirthDate(String birthDate) {
        UsersModel.birthDate = birthDate;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        UsersModel.address = address;
    }

    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        UsersModel.balance = balance;
    }

    public static int getAccountId() {
        return accountId;
    }

    public static void setAccountId(int accountId) {
        UsersModel.accountId = accountId;
    }

    public static int getNumClients() {
        return numClients;
    }

    public static void setNumClients(int numClients) {
        UsersModel.numClients = numClients;
    }

    static String age;

    static String user_id;
    static String birthDate;
    static String address;
    static int balance;
    static int accountId;
    static int numClients= 0;

}