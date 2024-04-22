/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class ElectronicProduct extends Product {
  private String brand;
   private int warrantyPeriod;
   
ElectronicProduct(){
    
}

    public ElectronicProduct(String brand, int warrantyPeriod) {
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public ElectronicProduct(String brand, int warrantyPeriod,int productId, String name, float price) {
        super(productId, name, price);
        setBrand(brand);
        setWarrantyPeriod(warrantyPeriod);
        
    }

   
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        if(warrantyPeriod>0)
          this.warrantyPeriod = warrantyPeriod;
        else
          this.warrantyPeriod=Math.abs(warrantyPeriod);

    }
    
    
}
