package com.limir.solidprincipals.single_responsibility.good;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }
}