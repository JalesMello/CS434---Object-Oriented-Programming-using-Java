/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.services;

import java.util.ArrayList;
import library.domain.Book;
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
public class BookSvcJDBCImplTest {
    
    public BookSvcJDBCImplTest() {
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
     * Test of add method, of class BookSvcJDBCImpl.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        
        // Create a list of authors and set other properties for book class
        ArrayList list = new ArrayList();
        list.add("Jales");
        list.add("Jackie");
        String title = "Mello"; // set title for book
        int isbn = 12345;       // set the isbn for book
        
        Book book = new Book(list, title, isbn);
        BookSvcJDBCImpl instance = new BookSvcJDBCImpl();
        Book expResult = new Book(list, title, isbn);
        Book result = instance.add(book);
        assertEquals(expResult, result);
    }
    
}
