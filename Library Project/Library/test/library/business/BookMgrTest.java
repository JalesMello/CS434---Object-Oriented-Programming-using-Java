/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.business;

import library.domain.Book;
import java.util.*;
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
public class BookMgrTest {
    
    public BookMgrTest() {
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
     * Test of storeBook method, of class BookMgr.
     */
    @Test
    public void testStoreBook() {
        System.out.println("storeBook");
        
        // Create a list of authors and set other properties for book class
        ArrayList list = new ArrayList();
        list.add("Jales");
        list.add("Jackie");
        String title = "Mello"; // set title for book
        int isbn = 123;         // set the isbn for book
        
        // Continue with the store book test
        Book book = new Book(list, title, isbn);
        BookMgr instance = new BookMgr();
        Book expResult = book;
        Book result = instance.storeBook(book);
        assertEquals(expResult, result);
    }
    
}
