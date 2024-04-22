/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

/**
 *
 * @author ASUS
 */
public class BookProduct extends Product {
   private String author;
   private String publisher;
    BookProduct(){
        
    }

    public BookProduct(String author, String publisher,int productId, String name, float price) {
        super(productId,name, price);
        setAuthor(author);
        setPublisher(publisher);
    }
    

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    
}
