/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

/**
 *
 * @author ASUS
 */
public class Product {
    protected int productId;
     protected String name;
    protected float price;
    Product(){
        
    }
    public Product(int productId, String name, float price) {
        setProductId(productId);
        setName(name);
        setPrice(price);
    }
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        if(productId>0){
        this.productId=productId; 
        }
        else 
           this.productId=Math.abs(productId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
       if(price>0){
        this.price=price; 
        }
        else 
           this.price=Math.abs(price);
    }
    
    
}
