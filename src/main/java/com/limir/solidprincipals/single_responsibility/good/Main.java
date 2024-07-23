package com.limir.solidprincipals.single_responsibility.good;

public class Main {
    public static void main(String[] args) {
        User user = new User("limir", "limir@example.com");
        UserValidator validator = new UserValidator();
        UserRepository repository = new UserRepository();

        if (validator.isValid(user)) {
            repository.save(user);
            System.out.println("User saved successfully.");
        } else {
            System.out.println("User validation failed.");
        }
    }
}

