/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tlaq.hibernate;

import com.tlaq.RepositoryImpl.CategoryRepositoryImpl;
import com.tlaq.RepositoryImpl.ProductRepositoryImpl;
import com.tlaq.RepositoryImpl.StatsRepositoryIpml;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author QUI
 */
public class Hibernate {

    public static void main(String[] args) {
        CategoryRepositoryImpl c = new CategoryRepositoryImpl();
        c.getCates().forEach(a -> System.out.println(a.getName()));
        
        Map<String, String> params = new HashMap<>();
        params.put("page", "2");
        
        ProductRepositoryImpl p = new ProductRepositoryImpl();
        p.getProducts(params).forEach(a -> System.out.printf("%d - %s: %d\n ", a.getId(), a.getName(), a.getPrice()));
        
        StatsRepositoryIpml s3 = new StatsRepositoryIpml();
        s3.statsRevenueByProduct().forEach(a -> System.out.printf("%d - %s - %d\n", a[0], a[1], a[2]));
        
        System.out.println("===========");
        s3.statsRevenueByTime("QUARTER", 2020).forEach(a -> System.out.printf("%d : %d\n", a[0], a[1]));
    }
}
