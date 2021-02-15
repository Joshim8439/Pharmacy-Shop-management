/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller.dao;

import com.controller.entity.Product;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductImp implements ProductInterface{

    SessionFactory sf;

    @Autowired
    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }
    
    
    
    @Override
    public ArrayList<Product> getAllProduct() {
        return (ArrayList<Product>) sf.openSession().createCriteria(Product.class).list();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getProductById(int id) {
        Session s = sf.openSession();
        Product p = (Product) s.createCriteria(Product.class).add(Restrictions.eq("id", id)).uniqueResult();
        return p;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
//    public Product getTot(double d) {
//        Session s = (Session) sf.openSession().createQuery("select sum(price)").uniqueResult();
//    }

    @Override
    public void addProduct(Product p) {
        Session s = sf.openSession();
        s.saveOrUpdate(p);
        s.flush();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateProduct(Product p) {
        Session s = sf.openSession();
        s.saveOrUpdate(p);
        s.flush();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteProduct(Product p) {
        Session s = sf.openSession();
        s.delete(p);
        s.flush();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
