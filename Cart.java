/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Cart {
    private int customerId,nProducts;
    private Product products[];

    public Cart(int customerId , int nProducts){
        this.customerId = customerId ;
        this.products = new Product[nProducts];
    }
    


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        if(customerId>0){
           this.customerId = customerId;

        }
        else
             this.customerId = Math.abs(customerId);

            
    }

    public int getnProducts() {
        return nProducts;
    }


    public void SetProducts(int size)
    {
        this.products = new Product[size];
    }

    public void setnProducts(int nProducts) {
     if(nProducts>0){
        this.nProducts = nProducts;

     } 
     else      
         this.nProducts = Math.abs(nProducts);

      SetProducts(this.nProducts);    

    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    
    public void addproduct(Product product,int n){
            this.products[n]=product;
    
    }
    public void removeProduct(int n){
        products[n]=null;
    }
    public double calculatelPrice(){
        double totalprice=0;
        for (int i = 0; i < nProducts; i++) {
           totalprice+=products[i].getPrice();
        }
        return totalprice;
            
    }
    public void placeorder(Order order1){
        order1.setCustomerId(this.customerId);
        order1.setProducts(products);
    }
}

    
    
    
    
   