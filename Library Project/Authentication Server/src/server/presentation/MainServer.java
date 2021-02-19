//----------------------------------------
// Author: Jales H. Mello
// Course: CS434
// Assn:   Main Server Class
//----------------------------------------

// Package:
package server.presentation;

// Imports:
import server.business.*;

// Class Definition:
public class MainServer {
    public static void main(String[] args) {
        ConnectionMgr connection = new ConnectionMgr();
        connection.startServer();
    }
    
}
