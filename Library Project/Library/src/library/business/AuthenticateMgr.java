//----------------------------------------
// Author: Jales H. Mello
// Course: CS434
// Assn:   AuthenticateMgr Class
//----------------------------------------

// Package:
package library.business;

// Imports:
import library.domain.*;
import library.services.*;

// Class Definition:
public class AuthenticateMgr {
    // Properties
    private boolean authenticated = false;
    
    // Contstructor
    public AuthenticateMgr() {}
    
    // Methods
    public boolean authenticate(Login login) {
        try {
            Factory factory = new Factory();
            IAuthenticateSvc authenticateSvc = 
                    (IAuthenticateSvc) factory.getService("IAuthenticateSvc");
            authenticated = authenticateSvc.authenticate(login);
        }
        catch (Exception e) {
            System.out.println("Error. User could not be authenticated: " + 
                    e.getMessage());
        }
        
        return authenticated;
    }
}
