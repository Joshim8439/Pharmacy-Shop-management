/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.controller.entity.Invoice;
import com.controller.dao.InvoiceInterface;
import com.controller.dao.ProductInterface;
import com.controller.entity.Product;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InvController {
  
    InvoiceInterface dao;
    ArrayList<Invoice> invoice;
    ProductInterface pdao;
    ArrayList<Product> products;

    @Autowired
    public void setDao(InvoiceInterface dao) {
        this.dao = dao;
    }

    @Autowired
    public void setPdao(ProductInterface pdao) {
        this.pdao = pdao;
    }
    
    
    
    @PostConstruct
    public void init(){
        load();
    }
    
    void load(){
        invoice=dao.getAllInvoice();
        products=pdao.getAllProduct();
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/body.htm")
    public String getHome(Model m){
        m.addAttribute("products", products);
        return "body";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/sale.htm")
    public String getSale(Model m){
        m.addAttribute("products", products);
        return "sale";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/order.htm")
    public String getOrder(Model m){
        m.addAttribute("invoice", invoice);
        return "order";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/purchase.htm")
    public String getPurchase(Model m){
        m.addAttribute("invoice", invoice);
        return "purchase";
    
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/add.htm")
    public String getinfo(){
        return "add";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/editorder.htm")
    public String getEditOrder(){
        return "editorder";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/login.htm")
    public String getLogin(){
        return "login";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/signup.htm")
    public String getSignup(){
        return "signup";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/user.htm")
    public String getUser(){
        return "user";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/signupinfo.htm")
    public String getSign(@RequestParam("name")String name,
                            @RequestParam("price")double price,
                            @RequestParam("quantity")int quantity,
                            Model m){
        Invoice user=new Invoice();
        
        
        
        return "order";
    }
    
    
    @RequestMapping(method = RequestMethod.GET, value = "/addinfo.htm")
    public String getAdd(@RequestParam("name")String name,
                            @RequestParam("price")double price,
                            @RequestParam("quantity")int quantity,
                            Model m){
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        p.setQuantity(quantity);
        pdao.addProduct(p);
        this.load();
        m.addAttribute("products", products);
        
        return "product";
    }
    
    
    
    @RequestMapping(method = RequestMethod.GET, value = "/edit.htm")
    public String getedit(@RequestParam("id")int id,
                            @RequestParam("name")String name,
                            @RequestParam("price")double price,
                            @RequestParam("quantity")int quantity,
                            Model m){
        
        m.addAttribute("id", id);
        m.addAttribute("name", name);
        System.out.println("name......"+name);
        m.addAttribute("price", price);
        m.addAttribute("quantity", quantity);
        return "edit";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/editinfo.htm")
    public String getEditInfo(@RequestParam("id")int id,
                            @RequestParam("name")String name,
                            @RequestParam("price")double price,
                            @RequestParam("quantity")int quantity,
                            Model m){
        Product p = new Product();
        p.setId(id);
        p.setName(name);
        p.setPrice(price);
        p.setQuantity(quantity);
        pdao.updateProduct(p);
        this.load();
        m.addAttribute("products", products);
        
        return "product";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/delete.htm")
    public String getDelete(@RequestParam("id")int id, Model m){
        Product p=pdao.getProductById(id);
        pdao.deleteProduct(p);
        this.load();
        m.addAttribute("products", products);
        return "product";
    }
    
    
    @RequestMapping(method = RequestMethod.GET, value = "/report.htm")
    public String getReport(){
        return "report";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/return.htm")
    public String getReturn(){
        return "return";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/list.htm")
    public String getList(Model m){
        
        m.addAttribute("invoice", invoice);
        m.addAttribute("products", products);
        return "list";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/product.htm")
    public String getProduct(Model m){
        
        m.addAttribute("products", products);
        return "product";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/default.htm")
    public String getPro(){
        
//        m.addAttribute("products", products);
        return "default";
    }
    
    public String getSum(){
        return "total";
    }
}
