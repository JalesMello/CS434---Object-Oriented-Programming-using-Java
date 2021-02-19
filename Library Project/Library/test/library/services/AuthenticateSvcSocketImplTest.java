/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.services;

import library.domain.Login;
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
public class AuthenticateSvcSocketImplTest {
    
    public AuthenticateSvcSocketImplTest() {
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
     * Test of authenticate method, of class AuthenticateSvcSocketImpl.
     */
    @Test
    public void testAuthenticate1() throws Exception {
        
        // NOTE: Server must be running for test to work!
        
        System.out.println("authenticate");
        Login login = new Login();
        login.setUserName("library");
        login.setPassword("admin");
        
        AuthenticateSvcSocketImpl instance = new AuthenticateSvcSocketImpl();
        boolean expResult = true;
        boolean result = instance.authenticate(login);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAuthenticate2() throws Exception {
        
        // NOTE: Server must be running for test to work!
        
        System.out.println("authenticate");
        Login login = new Login();
        login.setUserName("");
        login.setPassword("admin");
        
        AuthenticateSvcSocketImpl instance = new AuthenticateSvcSocketImpl();
        boolean expResult = false;
        boolean result = instance.authenticate(login);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAuthenticate3() throws Exception {
        
        // NOTE: Server must be running for test to work!
        
        System.out.println("authenticate");
        Login login = new Login();
        login.setUserName("library");
        login.setPassword("");
        
        AuthenticateSvcSocketImpl instance = new AuthenticateSvcSocketImpl();
        boolean expResult = false;
        boolean result = instance.authenticate(login);
        assertEquals(expResult, result);
    }
    
}
