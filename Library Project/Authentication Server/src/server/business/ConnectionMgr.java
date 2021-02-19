//----------------------------------------
// Author: Jales H. Mello
// Course: CS434
// Assn:   Connection Manager Class
//----------------------------------------

// Package:
package server.business;

// Imports:
import java.io.*;
import java.net.*;

// Class Definition:
public class ConnectionMgr {
    // Properties:
    ServerSocket server = null;
    Socket socket = null;
    
    // Methods:
    public ConnectionMgr(){}        // Default Constructor
    
    public void startServer () {
        try {
            server = new ServerSocket(8000, 100);
            while(true){
                socket = server.accept();
                SocketMgr socketMgr = new SocketMgr(socket);
                socketMgr.start();
            }
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    
}
