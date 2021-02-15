/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.controller.entity.Invoice;
import com.controller.dao.InvoiceInterface;
import com.controller.dao.ProductInterface;
import com.controller.dao.UserInterface;
import com.controller.entity.Product;
import com.controller.entity.User;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Controller
public class InvController {
  
    InvoiceInterface dao;
    ArrayList<Invoice> invoice;
    
    ProductInterface pdao;
    ArrayList<Product> products;
    ArrayList<Product> expdateList;
    ArrayList<Product> alertList;
    ArrayList<Invoice> UserAllOrder;
    ArrayList<Invoice> todayOrder;
    ArrayList<Invoice> betweenDate;
    ArrayList<Product> catList = new ArrayList<>();
    
    UserInterface uDao;
    ArrayList<User> users;
    
    int userid=0;
    int newQty=0;
    double newPrice=0;
    double due = 0;
    double userReturn = 0;
    

    @Autowired
    public void setDao(InvoiceInterface dao) {
        this.dao = dao;
    }

    @Autowired
    public void setPdao(ProductInterface pdao) {
        this.pdao = pdao;
    }

    @Autowired
    public void setuDao(UserInterface uDao) {
        this.uDao = uDao;
    }
    
    
    
    
    @PostConstruct
    public void init(){
        load();
    }
    
    void load(){
        invoice=dao.getAllInvoice();
        products=pdao.getAllProduct();
        users = uDao.getAllUser();
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/product.htm")
    public String getProduct(Model m){
        
        m.addAttribute("products", products);
        return "product";
    }
    
    
    @RequestMapping(method = RequestMethod.GET, value = "/body.htm")
    public String getHome(Model m){
        expdateList=pdao.getAllExpDate();
        alertList=pdao.getAlarQuantity();
        double purchasePrice = pdao.getPurchasePrice();
        double totSalePrice = dao.getTotalSalePrice();
        double totSalePurch = dao.getTotalSalePurch();
        
        m.addAttribute("products", products);
        m.addAttribute("alertList", alertList);
        m.addAttribute("expdateList", expdateList);
        m.addAttribute("purchasePrice", purchasePrice);
        m.addAttribute("totSalePrice", totSalePrice);
        m.addAttribute("totSalePurch", totSalePurch);
        m.addAttribute("invoice", invoice);
        m.addAttribute("users", users);
        
        return "body";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/sale.htm")
    public String getSale(Model m){
        todayOrder = dao.getTodayOrder();
        int maxId = dao.getMaxValue();
        m.addAttribute("todayOrder", todayOrder);
        m.addAttribute("maxId", maxId);
        return "sale";
    }
    
    
    
    
    @RequestMapping(method = RequestMethod.GET, value = "/salepass.htm")
    public String getSalePass(@RequestParam("id")int id,
                            @RequestParam("name")String name,
                            @RequestParam("price")double price,
                            @RequestParam("quantity")int quantity,
                            Model m){
        
        Product p = new Product();
        p.setId(id);
        p.setName(name);
        p.setPrice(price);
        p.setQuantity(quantity);
        catList.add(p);
//        m.addAttribute("id", id);
//        m.addAttribute("name", name);
//        m.addAttribute("price", price);
//        m.addAttribute("quantity", quantity);
        
        m.addAttribute("catList", catList);
        m.addAttribute("products", products);
        return "signup";
    }
    
    
    
    
    
    @RequestMapping(method = RequestMethod.GET, value = "/salepassinforder.htm")
    public String getSalepassOrder(@RequestParam("id")int id,
                            @RequestParam("name")String name,
                            @RequestParam("price")double price,
                            @RequestParam("price")double totalprice,
                            @RequestParam("quantity")int quantity,
                            @RequestParam("customertype")String customertype,
                            Model m){
        Product p = new Product();
        ArrayList<Product> catListinfo = new ArrayList<>();
        p.setId(id);
        p.setName("Ace");
        p.setPrice(price);
        Product proById = pdao.getProductById(id);
        String img = "http://www.squarepharma.com.bd/products/ACE-PARACETAMOL-500_n.jpg";
        p.setImage(img);
        p.setQuantity(proById.getQuantity()-quantity);
        catListinfo.add(p);
        pdao.updateProduct(p);
        
        
        
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        LocalDateTime now = LocalDateTime.now();
        String date = df.format(now);
        Date sysDate = new Date();
        String type = "customer";
        
        Invoice inv = new Invoice();
        inv.setName(customertype);
        inv.setProductname(name);
        inv.setPrice(price);
        inv.setQuantity(quantity);
        System.out.println("price------"+price+"quantity-----"+quantity+"totalprice-----"+totalprice);
        inv.setTotalprice((price*quantity)+totalprice);
        inv.setSaledate(sysDate);
        inv.setType(type);
        dao.addInvoice(inv);
        
        m.addAttribute("id", id);
        m.addAttribute("name", name);
        m.addAttribute("price", price);
        m.addAttribute("quantity", quantity);
        m.addAttribute("customertype", customertype);
        m.addAttribute("date", date);
        m.addAttribute("catList", catList);
        this.load();
        m.addAttribute("products", products);
        
        return "bill";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/salepassinfo.htm")
    public void getSalepassInfo(@RequestParam("id")int id,
                            @RequestParam("name")String name,
                            @RequestParam("price")double price,
                            @RequestParam("quantity")int quantity,
                            Model m){
        
        Product p = new Product();
        Product pItem=pdao.getProductById(id);
 

        p.setId(id);
        p.setName(name);
        p.setPrice(price);
        p.setQuantity(quantity);
        pdao.updateProduct(p);

        this.load();
        m.addAttribute("products", products);
        
//        return "sale";
    }
    
    
    
    
    @RequestMapping(method = RequestMethod.GET, value = "/order.htm")
    public String getOrder(Model m){
        m.addAttribute("invoice", invoice);
        return "order";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/purchase.htm")
    public String getPurchase( Model m){
        

        m.addAttribute("invoice", invoice);
        m.addAttribute("products", products);
        m.addAttribute("users", users);
        return "purchase";
    
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/purchaseinfo.htm")
    public String getPurchaseinfo(@RequestParam("id")int id,
                            @RequestParam("name")String name,
                            @RequestParam("price")double price,
                            @RequestParam("quantity")int quantity,
                            @RequestParam("image")String image,
                            Model m){
        
        m.addAttribute("id", id);
        m.addAttribute("name", name);
        m.addAttribute("price", price);
        m.addAttribute("quantity", quantity);
        m.addAttribute("image", image);
        m.addAttribute("products", products);
        return "purchase";
    }
    
    
    
    //addProduct
    @RequestMapping(method = RequestMethod.GET, value = "/add.htm")
    public String getinfo(){
        return "add";
    }
    
    
    @RequestMapping(method = RequestMethod.GET, value = "/addinfo.htm")
    public String getAdd(@RequestParam("name")String name,
                            @RequestParam("price")double price,
                            @RequestParam("quantity")int quantity,
                            @RequestParam("img")String img,
                            @RequestParam("supplier")String supplier,
                            Model m){
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        p.setQuantity(quantity);
        p.setImage(img);
        pdao.addProduct(p);
        
        String supname="supplier";
        Date sysdate = new Date();
        
        Invoice inv = new Invoice();
        inv.setProductid(p.getId());
        inv.setName(supplier);
        inv.setProductname(name);
        inv.setPrice(price);
        inv.setQuantity(quantity);
        inv.setTotalprice(quantity*price);
        inv.setType(supname);
        inv.setSaledate(sysdate);
//        dao.addInvoice(inv);
        
        this.load();
        m.addAttribute("products", products);
        m.addAttribute("invoice", invoice);
        
        return "stock";
    }
    
    
    //updateProduct
    @RequestMapping(method = RequestMethod.GET, value = "/edit.htm")
    public String getedit(@RequestParam("id")int id,
                            @RequestParam("name")String name,
                            @RequestParam("price")double price,
                            @RequestParam("quantity")int quantity,
                            
//                            @RequestParam("image")String img,
                            Model m){
        
        m.addAttribute("id", id);
        m.addAttribute("name", name);
        System.out.println("name......"+name);
        m.addAttribute("price", price);
        m.addAttribute("quantity", quantity);
//        m.addAttribute("img", img);
        return "edit";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/editinfo.htm")
    public String getEditInfo(@RequestParam("id")int id,
                            @RequestParam("name")String name,
                            @RequestParam("price")double price,
                            @RequestParam("quantity")int quantity,
                            @RequestParam("image")String image,
                            @RequestParam("supplier")String supplier,
                            
                            Model m){
        Product p = new Product();
        Product preQty =pdao.getProductById(id);
        p.setId(id);
        p.setName(name);
        p.setPrice(price);
        p.setImage(image);
        p.setQuantity(preQty.getQuantity()+quantity);
        pdao.updateProduct(p);
        
        Date date = new Date();
        Invoice inv = new Invoice();
        inv.setName(supplier);
        inv.setPrice(price);
        inv.setQuantity(quantity);
        inv.setTotalprice(price*quantity);
        inv.setType("supplier");
        inv.setProductname(name);
        inv.setSaledate(date);
        dao.addInvoice(inv);
         
        
        this.load();
        m.addAttribute("products", products);
        m.addAttribute("invoice", invoice);
        
        return "stock";
    }
    
    //deleteProduct
    @RequestMapping(method = RequestMethod.GET, value = "/delete.htm")
    public String getDelete(@RequestParam("id")int id, Model m){
        Product p=pdao.getProductById(id);
        pdao.deleteProduct(p);
        this.load();
        m.addAttribute("products", products);
        return "purchase";
    }
    
    public String priceQtyCalculate(@RequestParam("id")int id, 
                             @RequestParam("price")double price,
                             @RequestParam("quantity")int quantity,
                             Model m){
        
        Product p=pdao.getProductById(id);
        if(p.getPrice()>price && p.getQuantity()>quantity){
            
            int newQuty = p.getQuantity()-quantity;
            double total=quantity*(p.getPrice()/p.getQuantity());
            double newPrice=(p.getPrice()-total);
            
        }
        
        return "sale";
    }
    
    
    
    @RequestMapping(method = RequestMethod.GET, value = "/report.htm")
    public String getReport(Model m){
        
        expdateList=pdao.getAllExpDate();
        alertList=pdao.getAlarQuantity();
        m.addAttribute("alertList", alertList);
        m.addAttribute("expdateList", expdateList);
        return "report";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/return.htm")
    public String getReturn(Model m){
//        todayOrder = dao.getTodayOrder();
//        m.addAttribute("todayOrder", todayOrder);
        return "return";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/returntod.htm")
    public String getReturnTod(Model m){
        todayOrder = dao.getTodayOrder();
        System.out.println("tod--------------------------------"+todayOrder.size());
        m.addAttribute("todayOrder", todayOrder);
        return "return";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/returnbetween.htm")
    public String getReturnBetweenD(@RequestParam("todate")Date todate,
                                   @RequestParam("fromdate")Date fromdate,
                                    Model m){
        betweenDate = dao.getOrderBetween(todate, fromdate);
        m.addAttribute("betweenDate", betweenDate);
        return "return";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/returninfo.htm")
    public String getUserOrderReturn(@RequestParam("ordername")String ordername, Model m){
        m.addAttribute("ordername", ordername);
        UserAllOrder = dao.getUserAllInvoice(ordername);
        System.out.println("getUserAllInvoice-----------"+UserAllOrder.size());
        m.addAttribute("UserAllOrder", UserAllOrder);
        
        return "return";
    }
    
    
    
    
    
    @RequestMapping(method = RequestMethod.GET, value = "/default.htm")
    public String getPro(){
        
//        m.addAttribute("products", products);
        return "default";
    }
    
    
    //Invoice Or Order Or User data
    @RequestMapping(method = RequestMethod.GET, value = "/list.htm")
    public String getList(Model m){
        
        m.addAttribute("expdateList", expdateList);
        m.addAttribute("products", products);
        return "list";
    }
    
    
    @RequestMapping(method = RequestMethod.GET, value = "/editorder.htm")
    public String getEditOrder(){
        return "editorder";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/login.htm")
    public String getLogin(){
        return "login";
    }
    
//    @RequestMapping(method = RequestMethod.GET, value = "/logininfo.htm")
//    public String getLogininfo(@RequestParam("email")String email,
//                           @RequestParam("password")String password,
//                           Model m){
//        
//        
//        uDao.getLoginPass(email, password);
//        m.addAttribute("email", email);
//        m.addAttribute("password", password);
//        
//        return "body";
//    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/signup.htm")
    public String getSignup(Model m){
        m.addAttribute("products", products);
        return "signup";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/user.htm")
    public String getUser(Model m){
        
        
        return "user";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/userinf.htm")
    public String getUserinfo(@RequestParam("name")String name,
                          Model m){
        m.addAttribute("name", name);
        User u = uDao.getUserByName(name);
        m.addAttribute("u", u);
        return "user";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/useradd.htm")
    public String getAddUser(@RequestParam("name")String name,
                            @RequestParam("contact")String contact,
                            @RequestParam("address")String address,
                            Model m){
        User u = new User();
        u.setName(name);
        u.setContact(contact);
        u.setAddress(address);
        uDao.addUser(u);
        return "body";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/stock.htm")
    public String getStock(Model m){
        m.addAttribute("products", products);
        return "stock";
    }
    
    
    @RequestMapping(method = RequestMethod.GET, value = "/stockcat.htm")
    public String getStockCat(@RequestParam("type")String type,Model m){
        m.addAttribute("products", products);
        String t="";
        ArrayList<Product> prod=new ArrayList<>();
        // dynamic
        for(int i=0; i< prod.size(); i++) {
            Product p = prod.get(i);
            if(type.toLowerCase().equals(p.getCategory().toLowerCase())) {
                t = p.getCategory();
            }
        }
        m.addAttribute("catType", t);
        
        return "stock";
    }
    
    //addUserOrder
    @RequestMapping(method = RequestMethod.GET, value = "/userinfo.htm")
    public String getAddUserOrder(@RequestParam("id")int id,
                            @RequestParam("name")String name,
                            @RequestParam("price")double price,
                            @RequestParam("quantity")int quantity,
                            @RequestParam("totalprice")double totalprice,
                            @RequestParam("productname")String productname,
                            @RequestParam("productid")int productid,
                            @RequestParam("type")String type,
                            @RequestParam("userid")int userid,
                            @RequestParam("email")String email,
                            @RequestParam("password")String password,
                            Model m){
        
        Invoice user=new Invoice();
        user.setId(id);
        user.setName(name);
        user.setPrice(price);
        user.setQuantity(quantity);
        user.setTotalprice(totalprice);
        user.setProductname(productname);
        user.setProductid(productid);
        user.setType(type);
        user.setUserid(userid);
        user.setEmail(email);
        user.setPassword(password);
        
        dao.addInvoice(user);
        
        this.load();
        m.addAttribute("invoice", invoice);
        
        return "order";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/signupinfo.htm")
    public String getSign(@RequestParam("name")String name,
                            @RequestParam("email")String email,
                            @RequestParam("password")String password,
                            Model m){
        Invoice user=new Invoice();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        
        
        return "order";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/test.htm")
    public String getTest(Model m){
        Date date  = new Date();
        m.addAttribute("date",date);
        return "test";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/home.htm")
    public String getHome(){
        return "home";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/quantitylist.htm")
    public String getQuantitylist(Model m){
        alertList=pdao.getAlarQuantity();
        m.addAttribute("alertList", alertList);
        return "quantitylist";
    }
//    @RequestMapping(method = RequestMethod.GET, value = "/invoiceUpdate.htm")
//    public String updateInvoice(@RequestParam("qty") int qty,@RequestParam("id") int id, Model m){
//        
//        int pid = id;
//        int pqty = qty;
//        Product p = pdao.getProductById(pid);
//        int bqty = p.getQuantity();
//        int cqty = bqty - pqty;
//        if(cqty < 0){
//            p.setQuantity(0);
//            pdao.updateProduct(p);
//        } else {
//            p.setQuantity(cqty);
//            pdao.updateProduct(p);
//        }
//        return "quantitylist";
//    }
    
    
}
