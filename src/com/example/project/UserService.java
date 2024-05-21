package com.example.project;

public class UserService {
    private UserDAO userDAO = new UserDAO();

    public void add(User user) {
        userDAO.insert(user);
    }

    public User queryByUsername(String username) {
        return userDAO.selectByUsername(username);
    }
}
