//----------------------------------------
// Author: Jales H. Mello
// Course: CS434
// Assn:   Authentication Manager Class
//----------------------------------------

// Package:
package server.business;

// Imports:


// Class Definition:
public class AuthenticationMgr {
    // Properties:
    private final String userName = "library";
    private final String password = "admin";
    public boolean validated = false;
    
    // Methods:
    public AuthenticationMgr() {}
    
    public boolean validate (String user, String pass) {
        // Test if user is validated/authorized
        if ((userName.equals(user)) && (password.equals(pass)))
            validated = true;
        
        return validated;
    }
}
