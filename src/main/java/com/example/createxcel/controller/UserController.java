package com.example.createxcel.controller;

import com.example.createxcel.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserServcie userServcie;


}
