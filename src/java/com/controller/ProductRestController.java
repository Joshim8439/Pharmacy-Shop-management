/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.controller.dao.ProductImp;
import com.controller.dao.ProductInterface;
import com.controller.entity.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

    @Autowired
    private ProductImp proReposi;

    @RequestMapping(method = RequestMethod.GET, value = "/api/products")
    public ArrayList<Product> getProduct() {

        return proReposi.getAllProduct();

    }

}
