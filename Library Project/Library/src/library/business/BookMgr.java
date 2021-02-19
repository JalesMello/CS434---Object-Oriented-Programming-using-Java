//----------------------------------------
// Author: Jales H. Mello
// Course: CS434
// Assn:   BookMgr Class
//----------------------------------------

// Package:
package library.business;

// Imports:
import library.domain.*;
import library.services.*;

// Class Definition:
public class BookMgr {
    
    // Constructor
    public BookMgr() {}
    
    // Methods
    public Book storeBook(Book book) {
        try {
            Factory factory = new Factory();
            IBookSvc bookSvc = (IBookSvc) factory.getService("IBookSvc");
            bookSvc.add(book);
        }
        catch(Exception e) {
            System.out.println("Error. Unable to write the Book to a file.");
        }
        
        return book;
    }
    
}
