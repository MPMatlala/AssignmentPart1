/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignmentpart1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
public class Login {

    private String username;
    private String password;
    private String CellphoneNumber;
    
    
    
public Login(String username,String password,String CellphoneNumber){
       this.username = username;
       this.password = password;
       this.CellphoneNumber = CellphoneNumber;
       
       
       
}
      public boolean checkUserName(String username){
         
          
           return username.contains("_") && username.length()<=5;
           
       
      }
      
      
      public boolean checkpassword(String password){
       String regex = ("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{0,9}$");
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(password);
       
       return matcher.matches();       
      }
      public boolean checkCellphoneNumber(String CellphoneNumber){
       String regex = ("^\\+27\\d{9}$");
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(CellphoneNumber);
       
       return matcher.matches();
      }
      public String registerUser(){
      if (checkUserName(username)&& checkpassword(password)&&checkCellphoneNumber(CellphoneNumber)){
          return "Registration is successful";
          
      }else{
          return "Registration is unsuccessful";
       
      }    
      }
      public boolean loginUser(String username, String password){
          return this.username.equals(username)&& this.password.equals(password);
      }
      public String returnLoginStatus(String username, String password, String firstName, String lastName){
          if(loginUser(username,password)){
              return"Welcome" + firstName + (",")+  lastName + "It is great to see you again";
      }else{
              return "Login is unsuccessfully";
          }
      } //end of method
      
}
