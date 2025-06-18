/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tlaq.controllers;

import com.tlaq.pojo.User;
import com.tlaq.services.UserService;
import jakarta.mail.Multipart;
import jakarta.ws.rs.core.MediaType;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author QUI
 */
@RestController
@RequestMapping("/api")
public class ApiUserController {
    @Autowired
    private UserService userDetailService;
    
    @PostMapping(path ="/users", consumes = MediaType.MULTIPART_FORM_DATA)
    public ResponseEntity<User> register(@RequestParam Map<String, String> params, 
            @RequestParam(value = "avatar") MultipartFile avatar){
        this.userDetailService.register(params, avatar);
        return null;
    }
}
