/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller.dao;

import com.controller.entity.Invoice;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public interface InvoiceInterface {
  
    ArrayList<Invoice>getAllInvoice();
    Invoice getInvoiceById(int id);
    void addInvoice(Invoice inv);
    void updateInvoice(Invoice inv);
    void deleteInvoice(Invoice inv);
    int getMaxValue();
    ArrayList<Invoice> getUserAllInvoice(String ordername);
    ArrayList<Invoice> getOrderBetween(Date d1, Date d2);
    ArrayList<Invoice> getTodayOrder();
    double getTotalSalePrice();
    double getTotalSalePurch();
    
}
