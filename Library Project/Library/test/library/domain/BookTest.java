/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.domain;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mello
 */
public class BookTest {
    
    public BookTest() {
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
     * Test of setAuthors method, of class Book.
     */
    @Test
    public void testSetAuthors() {
        System.out.println("setAuthors");
        ArrayList<String> authors = new ArrayList();
        authors.add("");
        Book instance = new Book();
        instance.setAuthors(authors);
    }

    /**
     * Test of setTitle method, of class Book.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Book instance = new Book();
        instance.setTitle(title);
    }

    /**
     * Test of setISBN method, of class Book.
     */
    @Test
    public void testSetISBN() {
        System.out.println("setISBN");
        int ISBN = 0;
        Book instance = new Book();
        instance.setISBN(ISBN);
    }

    /**
     * Test of getAuthors method, of class Book.
     */
    @Test
    public void testGetAuthors() {
        System.out.println("getAuthors");
        ArrayList<String> authorList = new ArrayList();   // Create list of authors to pass to Object
        authorList.add("Jales");        // Add Jales to list
        authorList.add("Jackie");       // Add Jackie to list
        Book instance = new Book(authorList, "Mello", 12345);
        ArrayList<String> expResult = new ArrayList() {{
                add("Jales");
                add("Jackie");
        }};
        ArrayList<String> result = instance.getAuthors();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTitle method, of class Book.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        ArrayList<String> authorList = new ArrayList();
        authorList.add("Jales");
        authorList.add("Jackie");
        Book instance = new Book(authorList, "Mello", 12345);
        String expResult = "Mello";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of getISBN method, of class Book.
     */
    @Test
    public void testGetISBN() {
        System.out.println("getISBN");
        ArrayList<String> authorList = new ArrayList();
        authorList.add("Jales");
        authorList.add("Jackie");
        Book instance = new Book(authorList, "Mello", 12345);
        int expResult = 12345;
        int result = instance.getISBN();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Book.
     */
    @Test
    public void testEquals1() {
        System.out.println("equals");
        ArrayList<String> authorList = new ArrayList();
        authorList.add("Jales");
        authorList.add("Jackie");
        Book obj = new Book(authorList, "Mello", 12345);
        Book instance = new Book(authorList, "Mello", 12345);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    @Test
    public void testEquals2() {
        System.out.println("equals");
        ArrayList<String> authorList = new ArrayList();
        authorList.add("Jales");
        authorList.add("Jackie");
        Book obj = new Book(authorList, "Mello", 12345);
        Book instance = obj;
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    @Test
    public void testEquals3() {
        System.out.println("equals");
        ArrayList<String> authorList = new ArrayList();
        authorList.add("Jales");
        authorList.add("Jackie");
        Book obj = new Book(authorList, "Mello", 12345);
        Book instance = new Book(authorList, "Mello", 6789);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    @Test
    public void testEquals4() {
        System.out.println("equals");
        ArrayList<String> authorList = new ArrayList();
        authorList.add("Jales");
        authorList.add("Jackie");
        Book obj = new Book(authorList, "Mello", 12345);
        Book instance = new Book(authorList, "!!", 12345);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    @Test
    public void testEquals5() {
        System.out.println("equals");
        ArrayList<String> authorList = new ArrayList();
        authorList.add("Jales");
        authorList.add("Jackie");
        Book obj = new Book(authorList, "Mello", 12345);
        ArrayList<String> b = new ArrayList();
        Book instance = new Book(b, "Mello", 12345);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    @Test
    public void testEquals6() {
        System.out.println("equals");
        ArrayList<String> authorList = new ArrayList();
        authorList.add("Jales");
        authorList.add("Jackie");
        Object obj = new Object();
        Book instance = new Book(authorList, "Mello", 12345);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of validate method, of class Book.
     */
    @Test
    public void testValidate1() {
        System.out.println("validate");
        Book instance = new Book();
        boolean expResult = false;
        boolean result = instance.validate();
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate2() {
        System.out.println("validate");
        ArrayList<String> authorList = new ArrayList();
        authorList.add("Jales");
        authorList.add("Jackie");
        Book instance = new Book(authorList, "Mello", 12345);
        boolean expResult = true;
        boolean result = instance.validate();
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate3() {
        System.out.println("validate");
        ArrayList<String> authorList = new ArrayList();
        authorList.add("Jales");
        authorList.add("Jackie");
        Book instance = new Book(authorList, "Mello", 0);
        boolean expResult = false;
        boolean result = instance.validate();
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate4() {
        System.out.println("validate");
        ArrayList<String> authorList = new ArrayList();
        authorList.add("Jales");
        authorList.add("Jackie");
        Book instance = new Book(authorList, null, 12345);
        boolean expResult = false;
        boolean result = instance.validate();
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate5() {
        System.out.println("validate");
        ArrayList<String> authorList = new ArrayList();
        authorList.add("Jales");
        authorList.add("Jackie");
        Book instance = new Book(null, "Mello", 12345);
        boolean expResult = false;
        boolean result = instance.validate();
        assertEquals(expResult, result);
    }
    
}