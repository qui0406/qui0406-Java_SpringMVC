/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tlaq.repositories;

import com.tlaq.pojo.User;

/**
 *
 * @author QUI
 */
public interface UserRepository {
    User getUserByUserName(String username);
    User register(User u);
}
