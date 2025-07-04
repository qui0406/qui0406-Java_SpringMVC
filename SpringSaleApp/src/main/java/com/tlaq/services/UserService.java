/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tlaq.services;

import com.tlaq.pojo.User;
import java.util.Map;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author QUI
 */
public interface UserService extends UserDetailsService{
    User getUserByUserName(String username);
    User register(Map<String, String> params, MultipartFile avatar);
}
