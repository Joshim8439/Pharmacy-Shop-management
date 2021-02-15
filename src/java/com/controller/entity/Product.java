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
@Table(name="products")
@Transactional
public class Product {
    
    private int id;
    private String name;
    private double price;
    private int quantity;
    String image;
    String category;
    Date mfgdate;
    Date expdate;
    String shelf;
    String usertype;
    

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

    @Column(name="image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Column(name="category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Column(name="mfgdate")
    @Temporal(TemporalType.DATE)
    public Date getMfgdate() {
        return mfgdate;
    }

    public void setMfgdate(Date mfgdate) {
        this.mfgdate = mfgdate;
    }

    @Column(name="expdate")
    @Temporal(TemporalType.DATE)
    public Date getExpdate() {
        return expdate;
    }

    public void setExpdate(Date expdate) {
        this.expdate = expdate;
    }

    @Column(name="shelf")
    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    @Column(name="usertype")
    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
    
    
    
    
    
}
