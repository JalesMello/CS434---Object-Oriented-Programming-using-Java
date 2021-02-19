//----------------------------------------
// Author: Jales H. Mello
// Course: CS434
// Assn:   Factory
//----------------------------------------

// Package:
package library.services;

// Imports:
import java.io.*;
import java.util.*;

// Class Definition:
public class Factory {
    
    public Factory(){};
    
    public IService getService(String serviceName) throws Exception {
        Class c = Class.forName(getImplName(serviceName));
        return (IService) c.newInstance();
    }
    
    private String getImplName(String serviceName) throws Exception {
        FileInputStream fis = new FileInputStream("config/properties.txt");
        Properties props = new Properties();
        props.load(fis);
        fis.close();
        return props.getProperty(serviceName);
    }
    
}
