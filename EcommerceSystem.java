/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecommercesystem;

import java.util.Scanner;
public class EcommerceSystem {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
      Product p1=new ElectronicProduct("samsung",1,1,"smartphone",599.9f);
      Product p2=new ClothingProduct("medium","cotton",2,"T-shirt",19.99f);
      Product p3=new BookProduct("O'Reilly","X publications",3,"OOP",39.99f);
      System.out.println("Welcome to the ecommerce system!");
        System.out.println("Please Enter your id ");
        int id =input.nextInt();
        System.out.println("Please enter your name ");
        String name =input.next();
        System.out.println("Please enter your address");
        String address=input.next();
        Customer c=new Customer(id,name,address);
        System.out.println("How many products you want to add to your cart");
        int n2=input.nextInt();
        Cart cart=new Cart(c.getCustomerId(), n2);
        for (int i = 0; i < n2; i++) {
        System.out.println("which product would you like to add "+ "1- "+p1.getName()+"2- "+p2.getName()+"3- "+p3.getName());
        int num=input.nextInt();
              switch (num){
          case 1:
              cart.addproduct(p1, i);
              break;
          case 2:
              cart.addproduct(p2, i);
              break;
          case 3:
              cart.addproduct(p3, i);
              break;
      }  
        }
      Order order=new Order(cart.getCustomerId());  
        System.out.println("the total price is "+cart.calculatelPrice());
        System.out.println("Would you like to place the order 1- yes 2- No");
        int w=input.nextInt();
        if(w==1){
       cart.placeorder(order);
        order.Printinfo(); }
        
        else if (w == 2)
        {
          System.out.println("order unplaced");
        }
        else 
        {
          System.out.println("invalid input");
        }
      
        
    }
}
