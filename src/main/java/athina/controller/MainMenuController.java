/*
The MenuController is an object that is used for interactions between users and MainMenu JFrame
 */
package athina.controller;

import athina.model.User;
import athina.view.global.MainMenuView;

import java.util.ArrayList;
import javax.swing.JFrame;

public class MainMenuController {
    User user;
    ArrayList<JFrame> menu;

    public void connect(String username, String password){
    }

    public String checkUserType(String username){
        return null;
    }

    public void showInfo(User user){
    }
}
