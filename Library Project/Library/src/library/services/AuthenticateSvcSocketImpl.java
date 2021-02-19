//----------------------------------------
// Author: Jales H. Mello
// Course: CS434
// Assn:   Authenticate Service Socket Implementation
//----------------------------------------

// Package:
package library.services;

// Imports:
import library.domain.*;
import java.io.*;
import java.net.*;

// Class Definition:
public class AuthenticateSvcSocketImpl implements IAuthenticateSvc {
    // Properties
    public boolean authenticated = false;
    
    // Methods
    @Override
    public boolean authenticate(Login login) throws Exception {
        Socket socket = null;
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        
        try {
            socket = new Socket (InetAddress.getLocalHost(), 8000);
            in = new ObjectInputStream(socket.getInputStream());
            out = new ObjectOutputStream(socket.getOutputStream());
            
            out.writeObject(login.getUserName());
            out.writeObject(login.getPassword());
            String validated = (String) in.readObject();
            
            if (validated.equals("true"))
                authenticated = true;
        }
        catch (Exception e) {
           System.out.println("Exception: " + e.getMessage());
	}
        finally {
            try {
                in.close();
                out.close();
                socket.close();
            }
            catch (Exception e){
                System.out.println("Closing Exception: " + e.getMessage());
            }
        }
        
        return authenticated;
    }
    
}
