/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tlaq.RepositoryImpl;

import com.tlaq.hibernate.HibernateUtils;
import com.tlaq.pojo.Cart;
import com.tlaq.pojo.SaleOrder;
import java.util.Date;
import java.util.Map;
import org.hibernate.Session;

/**
 *
 * @author QUI
 */
public class ReceiptRepositoryIpml {
    public void addReceipt(Map<String, Cart> carts){
        try(Session s = HibernateUtils.getFACTORY().openSession()){
            SaleOrder r = new SaleOrder();
            r.setCreatedDate(new Date());
            
            s.persist(r);
        }
    }
}
