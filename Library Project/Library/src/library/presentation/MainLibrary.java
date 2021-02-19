//----------------------------------------
// Author: Jales H. Mello
// Course: CS434
// Assn:   Week 8 - Main Class
// Paragraph: This week we threaded the SocketMgr class to handle multiple
//  sockets on the server. 
//----------------------------------------

// Package:
package library.presentation;

// Imports:
import javax.swing.*;

// Class Definition:
public class MainLibrary {
    public static void main(String[] args) {
        JFrame loginFrame = new LoginUI();
        loginFrame.setVisible(true);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
