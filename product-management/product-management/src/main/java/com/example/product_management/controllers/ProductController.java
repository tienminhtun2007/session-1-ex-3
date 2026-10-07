package com.example.product_management.controllers;

import com.example.product_management.modals.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductServices productServices;
}
