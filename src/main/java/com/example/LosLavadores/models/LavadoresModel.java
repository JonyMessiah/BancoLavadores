package com.example.LosLavadores.models;
import java.util.*;


public class LavadoresModel {

    static ArrayList<String> name = new ArrayList<String>();

    public static ArrayList<String> getName() {
        return name;
    }

    public static void setName(ArrayList<String> name) {
        LavadoresModel.name = name;
    }

    public static ArrayList<String> getAge() {
        return age;
    }

    public static void setAge(ArrayList<String> age) {
        LavadoresModel.age = age;
    }

    public static ArrayList<String> getId() {
        return id;
    }

    public static void setId(ArrayList<String> id) {
        LavadoresModel.id = id;
    }

    public static ArrayList<String> getBirthDate() {
        return birthDate;
    }

    public static void setBirthDate(ArrayList<String> birthDate) {
        LavadoresModel.birthDate = birthDate;
    }

    public static ArrayList<String> getAddress() {
        return address;
    }

    public static void setAddress(ArrayList<String> address) {
        LavadoresModel.address = address;
    }

    public static ArrayList<Integer> getSalary() {
        return salary;
    }

    public static void setSalary(ArrayList<Integer> salary) {
        LavadoresModel.salary = salary;
    }

    public static ArrayList<Integer> getAccountId() {
        return accountId;
    }

    public static void setAccountId(ArrayList<Integer> accountId) {
        LavadoresModel.accountId = accountId;
    }

    public static int getNumClients() {
        return numClients;
    }

    public static void setNumClients(int numClients) {
        LavadoresModel.numClients = numClients;
    }

    static ArrayList<String> age = new ArrayList<String>();
    static ArrayList<String> id = new ArrayList<String>();
    static ArrayList<String> birthDate = new ArrayList<String>();
    static ArrayList<String> address = new ArrayList<String>();
    static ArrayList<Integer> salary = new ArrayList<Integer>();
    static ArrayList<Integer> accountId = new ArrayList<Integer>();
    static int numClients= 0;

}