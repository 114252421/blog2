package com.example.project;

public class UserController {
    private UserService userService = new UserService();

    public String login(String username, String password) {
        User user = userService.queryByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return "Login successful";
        }
        return "Login failed";
    }

    public String reg(User user) {
        userService.add(user);
        return "Registration successful";
    }
}
