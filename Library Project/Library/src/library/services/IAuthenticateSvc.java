//----------------------------------------
// Author: Jales H. Mello
// Course: CS434
// Assn:   Authenticate Service Interface
//----------------------------------------

// Package:
package library.services;

// Imports:
import library.domain.*;

// Class Definition:
public interface IAuthenticateSvc extends IService {
    public boolean authenticate(Login login) throws Exception;
}
