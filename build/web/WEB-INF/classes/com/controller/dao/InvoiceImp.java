/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller.dao;

import com.controller.entity.Invoice;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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

    

    
    
    
}
