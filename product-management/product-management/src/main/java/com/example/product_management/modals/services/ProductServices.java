package com.example.product_management.modals.services;

import com.example.product_management.modals.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServices {
    List<Product> productList = new ArrayList<>(
            Arrays.asList(
                    new Product(1, "Product A", 10.0f),
                    new Product(2, "Product B", 20.0f),
                    new Product(3, "Product C", 30.0f)
            )
    );

    public List<Product> getProductList() {
        return productList;
    };
}
