/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller.dao;

import com.controller.entity.Product;
import java.util.ArrayList;
import java.util.Date;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
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
    
    @Override
    public void getMaxValue(){
        Criteria cri=(Criteria) sf.openSession().createCriteria(Product.class).setProjection(Projections.max("id"));
        Integer ids = (Integer)cri.uniqueResult();
        System.out.println("maximum Id.........."+ids);
    }

    @Override
    public void getAvgValue() {
        Criteria cri=(Criteria) sf.openSession().createCriteria(Product.class).setProjection(Projections.avg("price"));
        Double avgPrice = (Double)cri.uniqueResult();
        System.out.println("Average Price.........."+avgPrice);

//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //https://www.tutorialspoint.com/hibernate/hibernate_criteria_queries.htm
    @Override
    public void getQuantity() {
//         Criteria cri=(Criteria) sf.openSession().createCriteria(Product.class).setProjection(Projections.count("id"));
//        int avgPrice = (int)cri.uniqueResult();
//        System.out.println("Count Qty.........."+avgPrice);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Product> getAllExpDate() {
        Date date = new Date();
        return (ArrayList<Product>) sf.openSession().createCriteria(Product.class).add(Restrictions.lt("expdate", date)).list();

//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Product> getAlarQuantity() {
        return (ArrayList<Product>) sf.openSession().createCriteria(Product.class).add(Restrictions.lt("quantity", 5)).list();

//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPurchasePrice() {
        Criteria cri=(Criteria) sf.openSession().createCriteria(Product.class).setProjection(Projections.sum("price"));
        Double sumPrice = (Double)cri.uniqueResult();
        return sumPrice;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getProductByName(String name) {
        Product p =(Product) sf.openSession().createCriteria(Product.class).add(Restrictions.eq("name", name)).uniqueResult();
        return p;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
