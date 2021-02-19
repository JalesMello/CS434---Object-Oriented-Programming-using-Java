//----------------------------------------
// Author: Jales H. Mello
// Course: CS434
// Assn:   Socket Manager Class
//----------------------------------------

// Package:
package server.business;

// Imports:
import java.io.*;
import java.net.*;

// Class Definition:
public class SocketMgr extends Thread{
    // Properties:
    private Socket socket = null;
    ObjectInputStream in = null;
    ObjectOutputStream out = null;
    boolean authorized = false;
    
    // Methods:
    public SocketMgr(Socket socket) {
        this.socket = socket;
    }
    
    @Override
    public void run() {
        try {
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            
            // Read in User and Password from Connection
            String user = (String)in.readObject();
            String pass = (String)in.readObject();
            
            // Authorize the User
            AuthenticationMgr authMgr = new AuthenticationMgr();
            authorized = authMgr.validate(user, pass);
            
            // Return Authorization Test Result
            if (authorized)
                out.writeObject("true");
            else
                out.writeObject("false");
                
            // Close Resources
            in.close();
            out.close();
            socket.close();
        } catch(Exception e) {
            System.out.println("Error. Exception communicating with socket: " +
                    e.getMessage());
        }
    }
}
