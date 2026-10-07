package com.example.product_management.modals.entities;


public class Product {
    private int productId;
    private String productName;
    private float productPrice;

    public Product(int productId, String productName, float productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public float getProductPrice() {
        return productPrice;
    }
}
