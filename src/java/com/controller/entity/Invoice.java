/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.transaction.annotation.Transactional;

@Entity
@Table(name="report")
@Transactional
public class Invoice {
   
    int id;
    String name;
    double price;
    int quantity;
    double totalprice;
    String productname;
    int productid;
    String type;
    int userid;
    String email;
    String password;
    Date saledate;

    
    
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="price")
    public double getPrice() {
        return price;
    }

    
    public void setPrice(double price) {
        this.price = price;
    }

    @Column(name="quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Column(name="totalprice")
    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    @Column(name="productname")
    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    @Column(name="productid")
    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    @Column(name="type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="userid")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Column(name="email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="saledate")
    @Temporal(TemporalType.DATE)
    public Date getSaledate() {
        return saledate;
    }

    public void setSaledate(Date saledate) {
        this.saledate = saledate;
    }
    
    
    
}
