//----------------------------------------
// Author: Jales H. Mello
// Course: CS434
// Assn:   Book Service Interface
//----------------------------------------

// Package:
package library.services;

// Imports:
import library.domain.*;

// Class Definition:
public interface IBookSvc extends IService {
    public Book add(Book book) throws Exception;
    public Book find(int isbn) throws Exception;
    public Book update(Book book) throws Exception;
    public Book remove(Book book) throws Exception;
}

