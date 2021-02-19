//----------------------------------------
// Author: Jales H. Mello
// Course: CS434
// Assn:   Book Service JDBC Implementation
//----------------------------------------

// Package:
package library.services;

// Imports:
import library.domain.*;
import java.sql.*;
import javax.sql.*;

// Class Definition:
public class BookSvcJDBCImpl implements IBookSvc {
    
    private String connString = 
            "jdbc:mysql://localhost/library?user=root&password=admin&useSSL=false";
    
    private Connection getConnection() throws Exception {
        return DriverManager.getConnection(connString);
    }

    @Override
    public Book add(Book book) throws Exception {
	Connection conn = getConnection();
        
	try {
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO book (author, title, isbn) " + 
                "VALUES ('" + book.getAuthors() + "', '" + book.getTitle() 
                + "', '" + book.getISBN() + "')";
            stmt.executeUpdate(sql);
            stmt.close();
	}
        catch (Exception e) {
	   throw e;
	}
        finally {
            if (conn != null) conn.close();
	}

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
