package com.example.LosLavadores.dao;

import com.example.LosLavadores.interfaces.DAOInterface;
import com.example.LosLavadores.models.UsersModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsersDao implements DAOInterface<UsersModel> {
    private List<UsersModel> users = new ArrayList<>();

    public Optional<UsersModel> getById(String id) {
        return Optional.ofNullable(users.stream().filter(p -> p.getId().equals(id)).findAny()
                .orElse(null));
    }

    @Override
    public void save(UsersModel user) {
        users.add(user);
    }
}