//----------------------------------------
// Author: Jales H. Mello
// Course: CS434
// Assn:   Login Class
//----------------------------------------

// Package:
package library.domain;

// Imports:

// Class Definition:
public class Login {
    // Properties
    private String userName;
    private String password;
    
    // Methods
    // - Constructors
    public Login() {            // the default constructor
        userName = null;
        password = null;
    }
    
    public Login(String user, String pass) { // 2nd constructor
        userName = user;
        password = pass;
    }
    
    // - Setters
    public void setUserName(String user) {userName = user;}
    public void setPassword(String pass) {password = pass;}
    
    // - Getters
    public String getUserName() {return userName;}
    public String getPassword() {return password;}
    
    // - Other Methods
    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (! (obj instanceof Login))
            return false;
        Login item = (Login)obj;    // cast object to Login
        if (this.userName != item.userName)
            return false;
        if (this.password != item.password)
            return false;
        return true;
    }
    
    public boolean validate() {
        if (userName == null)
            return false;
        if (password == null)
            return false;
        return true;
    }
     
}