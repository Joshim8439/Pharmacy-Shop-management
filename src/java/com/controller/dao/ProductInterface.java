/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller.dao;

import com.controller.entity.Product;
import java.util.ArrayList;


public interface ProductInterface {
  
    
    ArrayList<Product> getAllProduct();
    Product getProductById(int id);
    void addProduct(Product p);
    void updateProduct(Product p);
    void deleteProduct(Product p);
    void getMaxValue();
    void getAvgValue();
    void getQuantity();
    ArrayList<Product> getAllExpDate();
    ArrayList<Product> getAlarQuantity();
    double getPurchasePrice();
    Product getProductByName(String name);
    
    
}
