/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

/**
 *
 * @author ASUS
 */
public class ClothingProduct extends Product {
    private String size;
    private String fabric;
    ClothingProduct(){
    }

    public ClothingProduct(String size, String fabric, int productId, String name, float price) {
        super(productId, name, price);
        setSize(size);
        setFabric(fabric);
    }
    

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    
    
}
