/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tlaq.services;

import com.tlaq.pojo.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author QUI
 */
public interface ProductService {
    List<Product> getProducts(Map<String, String> params);
    Product getProductById(int id);
    void deleteProduct(int id);
    Product addOrUpdate(Product p);
}
