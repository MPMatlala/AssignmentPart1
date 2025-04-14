/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.assignmentpart1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
    public LoginTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
  

    /**
     * Test of checkUserName method, of class Login.
     */
    @org.junit.Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "user_";
        Login instance = null;
        boolean expResult = true;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkpassword method, of class Login.
     */
    @org.junit.Test
    public void testCheckpassword() {
        System.out.println("checkpassword");
        String password = "";
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.checkpassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCellphoneNumber method, of class Login.
     */
    @org.junit.Test
    public void testCheckCellphoneNumber() {
        System.out.println("checkCellphoneNumber");
        String CellphoneNumber = "";
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.checkCellphoneNumber(CellphoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @org.junit.Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        Login instance = null;
        String expResult = "";
        String result = instance.registerUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @org.junit.Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "";
        String password = "";
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.loginUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @org.junit.Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String username = "";
        String password = "";
        String firstName = "";
        String lastName = "";
        Login instance = null;
        String expResult = "";
        String result = instance.returnLoginStatus(username, password, firstName, lastName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
