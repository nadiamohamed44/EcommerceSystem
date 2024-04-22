
package com.mycompany.ecommercesystem;
public class Order {
    private int customerId ; 
    private static int orderIds=1;
    private int orderId;
    
    private int nProducts;
    private Product products[];
    private float totalPrice;
    
    public Order(int customerId)
    {
        this.setCustomerId(customerId);
        this.orderId=orderIds;
        orderIds+=1;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = nProducts;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    
   

    public void Printinfo(){
        System.out.println("Order ID :"+orderId);
        System.out.println("Customer ID : "+customerId);
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName() + " - $" + product.getPrice());
                }
}
    }
    
    
}
