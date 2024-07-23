package com.limir.solidprincipals.single_responsibility.good;

public class UserValidator {
    public boolean isValid(User user) {
        return isValidUsername(user.getUserName()) && isValidPassword(user.getPassword());
    }

    private boolean isValidUsername(String userName) {
        // Validation logic
        return userName != null && !userName.trim().isEmpty();
    }

    private boolean isValidPassword(String password) {
        // Validation logic
        return password != null && !password.trim().isEmpty();
    }
}
