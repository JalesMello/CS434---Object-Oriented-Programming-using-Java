//----------------------------------------
// Author: Jales H. Mello
// Course: CS434
// Assn:   Book Class
//----------------------------------------

// Package:
package library.domain;

// Imports:
import java.util.*;             // Utility import for ArrayList usage
import java.io.Serializable;    // Serialize the Book class

// Class Definition:
public class Book implements Serializable {
    // Properties
    ArrayList<String> authors;  // Authors of the book
    String title;               // Title of the book
    int isbn;                   // ISBN number of the book
    
    // Methods
    // - Constructors
    public Book() {    // the default constructor
        authors = new ArrayList<>();
        title = null;
        isbn = 0;
    }
    
    public Book(ArrayList<String> authors, String title, int ISBN) { // 2nd constructor
        this.authors = authors;
        this.title = title;
        this.isbn = ISBN;
    }
    
    // - Setters
    public void setAuthors(ArrayList<String> authors) {this.authors = authors;}
    public void setTitle(String title) {this.title = title;}
    public void setISBN(int isbn) {this.isbn = isbn;}
    
    // - Getters
    public ArrayList<String> getAuthors() {return authors;}
    public String getTitle() {return title;}
    public int getISBN() {return isbn;}
    
    // - Other Methods
    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (! (obj instanceof Book))
            return false;
        Book item = (Book)obj;  // cast object to Book
        if (this.authors != item.authors)
            return false;
        if (this.title != item.title)
            return false;
        if (this.isbn != item.isbn)
            return false; 
        return true;
    }
    
    @Override
    public String toString() {
        return "Authors: " + authors + "\n" +
               "Title: " + title + "\n" +
               "ISBN: " + isbn;
    }
    
    public boolean validate() {
        if (authors == null)
            return false;
        if (title == null)
            return false;
        if (isbn == 0)
            return false;
        return true;
    }
     
}
