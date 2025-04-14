/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignmentpart1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class AssignmentPart1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Login object with initial placeholder values
        Login login = new Login("", "", "");

        // Registration process
        System.out.print("Enter first name: ");
            String first_Name = scanner.nextLine();

            System.out.print("Enter last name: ");
            String last_Name = scanner.nextLine();
        
        System.out.println("=== User Registration ===");
        System.out.print("Enter username  ");
        String username = scanner.nextLine();

        System.out.print("Enter password (min 8 chars, 1 uppercase, 1 lowercase, 1 digit, 1 special char): ");
        String password = scanner.nextLine();

        System.out.print("Enter cellphone number (e.g., +27831234567): ");
        String cellphone = scanner.nextLine();

        String registrationResult = login.registerUser(username, password, cellphone);
        System.out.println(registrationResult);

        if (registrationResult.contains("successful")) {
            // Get first and last name for login status
           

            // Login process
            System.out.println("\n=== User Login ===");
            System.out.print("Enter username: ");
            String loginUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String loginPassword = scanner.nextLine();

            String loginStatus = login.returnLoginStatus(loginUsername, loginPassword, first_Name, last_Name);
            System.out.println(loginStatus);
        }

        scanner.close();
    }
}
    

