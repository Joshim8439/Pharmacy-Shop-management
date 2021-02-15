/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller.dao;

import com.controller.entity.User;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImp implements UserInterface{
    
    SessionFactory sf;

    @Autowired
    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }
    
    

    @Override
    public ArrayList<User> getAllUser() {
        return (ArrayList<User>) sf.openSession().createCriteria(User.class).list();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getUserById(int id) {
        User u = (User) sf.openSession().createCriteria(User.class).add(Restrictions.eq("id", id)).uniqueResult();
        return u;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addUser(User u) {
        Session s = sf.openSession();
        s.saveOrUpdate(u);
        s.flush();
        s.close();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateUser(User u) {
        Session s = sf.openSession();
        s.saveOrUpdate(u);
        s.flush();
        s.close();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteUser(User u) {
        Session s = sf.openSession();
        s.delete(u);
        s.flush();
        s.close();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public User getLoginPass(String email, String pass) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        Criteria cri =sf.openSession().createCriteria(User.class);
//        Criterion crion1 =Restrictions.eq("email", email);
//        Criterion crion2 =Restrictions.eq("pass", pass);
//        Criterion crion3 =Restrictions.and(crion1, crion2);
//        System.out.println("email-------"+email);
//        System.out.println("pass-------"+pass);
//        User u =(User) cri.add(crion3);
//        return u;
//        
//        
//        
//    }
    
    
    @Override
    public User getUserByName(String name) {
        User u =(User) sf.openSession().createCriteria(User.class).add(Restrictions.eq("name", name)).uniqueResult();
        return u;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
