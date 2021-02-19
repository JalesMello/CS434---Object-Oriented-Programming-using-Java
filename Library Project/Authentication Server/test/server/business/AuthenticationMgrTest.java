/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.business;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jales
 */
public class AuthenticationMgrTest {
    
    public AuthenticationMgrTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validate method, of class AuthenticationMgr.
     */
    @Test
    public void testValidate1() {
        System.out.println("validate");
        String user = "library";
        String pass = "admin";
        AuthenticationMgr instance = new AuthenticationMgr();
        boolean expResult = true;
        boolean result = instance.validate(user, pass);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidate2() {
        System.out.println("validate");
        String user = "John";
        String pass = "admin";
        AuthenticationMgr instance = new AuthenticationMgr();
        boolean expResult = false;
        boolean result = instance.validate(user, pass);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidate3() {
        System.out.println("validate");
        String user = "library";
        String pass = "John";
        AuthenticationMgr instance = new AuthenticationMgr();
        boolean expResult = false;
        boolean result = instance.validate(user, pass);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidate4() {
        System.out.println("validate");
        String user = "";
        String pass = "";
        AuthenticationMgr instance = new AuthenticationMgr();
        boolean expResult = false;
        boolean result = instance.validate(user, pass);
        assertEquals(expResult, result);
    }
    
}
