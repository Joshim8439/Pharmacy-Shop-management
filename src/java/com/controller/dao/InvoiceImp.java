/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller.dao;

import com.controller.entity.Invoice;
import java.util.ArrayList;
import java.util.Date;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceImp implements InvoiceInterface{

    SessionFactory sf;

    @Autowired
    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }
    
    
    
    @Override
    public ArrayList<Invoice> getAllInvoice() {
        return (ArrayList<Invoice>) sf.openSession().createCriteria(Invoice.class).list();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Invoice getInvoiceById(int id) {
        Invoice inv = (Invoice) sf.openSession().createCriteria(Invoice.class).add(Restrictions.eq("id", id)).uniqueResult();
        return inv;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addInvoice(Invoice inv) {
        Session s = sf.openSession();
        s.saveOrUpdate(inv);
        s.flush();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateInvoice(Invoice inv) {
        Session s = sf.openSession();
        s.saveOrUpdate(inv);
        s.flush();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteInvoice(Invoice inv) {
        Session s = sf.openSession();
        s.delete(inv);
        s.flush();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMaxValue(){
        Criteria cri=(Criteria) sf.openSession().createCriteria(Invoice.class).setProjection(Projections.max("id"));
        Integer maximumId = (Integer)cri.uniqueResult()+1;
        return maximumId;
    }

    @Override
    public ArrayList<Invoice> getUserAllInvoice(String ordername) {
        Session s = sf.openSession();
       return (ArrayList<Invoice>) s.createCriteria(Invoice.class).add(Restrictions.eq("name", ordername)).list();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTotalSalePrice() {
        Criteria cri=(Criteria) sf.openSession().createCriteria(Invoice.class).setProjection(Projections.sum("totalprice"));
        Double totPrice = (Double)cri.uniqueResult();
        return totPrice;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTotalSalePurch() {
        Criteria cri=(Criteria) sf.openSession().createCriteria(Invoice.class).setProjection(Projections.sum("price"));
        Double totPrice = (Double)cri.uniqueResult();
        return totPrice;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, cho    }

    
    }

    @Override
    public ArrayList<Invoice> getTodayOrder() {
        Date date = new Date();
        return (ArrayList<Invoice>) sf.openSession().createCriteria(Invoice.class).add(Restrictions.eq("saledate", date)).list();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Invoice> getOrderBetween(Date d1, Date d2) {
        return (ArrayList<Invoice>) sf.openSession().createCriteria(Invoice.class).add(Restrictions.between("saledate", d1, d2)).list();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
}
