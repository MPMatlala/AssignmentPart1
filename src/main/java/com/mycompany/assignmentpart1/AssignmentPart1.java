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
        String username = " ";

        String password = " ";

        String CellphoneNumber = " ";

        Login login = new Login(username, password, CellphoneNumber);

        System.out.print("Enter firstname: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter lastName: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter username: ");
        username = scanner.nextLine();

        if (login.checkUserName(username)) {
            System.out.println("valid username");
        } else {
            System.out.println("invalid username");
        }

        System.out.print("Enter password: ");
        password = scanner.nextLine();

        if (login.checkpassword(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("invalid password");
        }

        System.out.print("Enter CellphoneNumber: ");
        CellphoneNumber = scanner.nextLine();

        if (login.checkCellphoneNumber(CellphoneNumber)) {
            System.out.println("valid CellphoneNumber");
        } else {
            System.out.println("invalid CellphoneNumber");
        }

        String registrationMessage = login.registerUser();

        System.out.println(registrationMessage);

        if (registrationMessage.contains("Successfully")) {
            System.out.println("\n------LogIn------");
            System.out.print("Enter username");
            String loginUsername = scanner.nextLine();

            System.out.print("Enter password");
            String loginpassword = scanner.nextLine();

            String loginStatus = login.returnLoginStatus(username, password, firstName, lastName);
            System.out.println(loginStatus);

        }

    }

}
