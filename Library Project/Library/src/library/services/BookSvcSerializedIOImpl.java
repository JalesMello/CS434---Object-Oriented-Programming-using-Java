//----------------------------------------
// Author: Jales H. Mello
// Course: CS434
// Assn:   Book Service Serialized IO Implementation
//----------------------------------------

// Package:
package library.services;

// Imports:
import library.domain.*;
import java.io.*;

// Class Definition:
public class BookSvcSerializedIOImpl implements IBookSvc {

    @Override
    public Book add(Book book) throws Exception {
        FileOutputStream fos = new FileOutputStream("BookSvc.txt");
        ObjectOutputStream output = new ObjectOutputStream(fos);
        output.writeObject(book);
        output.flush();
        output.close();
        return book;
    }

    @Override
    public Book find(int isbn) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book update(Book book) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book remove(Book book) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
