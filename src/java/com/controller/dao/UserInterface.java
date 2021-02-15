/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller.dao;

import com.controller.entity.User;
import java.util.ArrayList;


public interface UserInterface {
   
    ArrayList<User> getAllUser();
    User getUserById(int id);
    void addUser(User u);
    void updateUser(User u);
    void deleteUser(User u);
//    User getLoginPass(String email, String pass);
    
    User getUserByName(String name);
}
