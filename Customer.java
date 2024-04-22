/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

/**
 *
 * @author ASUS
 */
public class Customer {
   private int customerId;
   private String name,address;

    public Customer(int customerId, String name, String address) {
        setCustomerId(customerId);
        setName(name);
        setAddress(address);
    }
    

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        if(customerId>0)
         this.customerId = customerId;
        else
           this.customerId=Math.abs(customerId);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
