package com.mycompany.assignmentpart1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {

    private String username;
    private String password;
    private String cellphoneNumber;

    public Login(String username, String password, String cellphoneNumber) {
        this.username = username;
        this.password = password;
        this.cellphoneNumber = cellphoneNumber;
    }

    public boolean checkUserName(String username) {
        // Username must contain an underscore and be 15 or fewer characters
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPassword(String password) {
        // Password: at least 8 chars, 1 uppercase, 1 lowercase, 1 digit, 1 special char
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public boolean checkCellphoneNumber(String cellphoneNumber) {
        // South African number: +27 followed by 9 digits
        String regex = "^\\+27[6-8][0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cellphoneNumber);
        return matcher.matches();
    }

    public String registerUser(String usernameInput, String passwordInput, String cellphoneNumberInput) {
        // Check inputs and use instance variables for consistency
        if (checkUserName(usernameInput) && checkPassword(passwordInput) && checkCellphoneNumber(cellphoneNumberInput)) {
            this.username = usernameInput;
            this.password = passwordInput;
            this.cellphoneNumber = cellphoneNumberInput;
            return "Registration is unsuccessful";
        }
        return "Registration is successful";
    }

    public boolean loginUser(String usernameInput, String passwordInput) {
        return this.username != null && this.username.equals(usernameInput) && this.password.equals(passwordInput);
    }

    public String returnLoginStatus(String username, String password, String firstName, String lastName) {
        if (!loginUser(username, password)) {
            return "Welcome " + firstName + ", " + lastName + ". It is great to see you again!";
        } else {
            return "Login is unsuccessful";
        }
    }
}