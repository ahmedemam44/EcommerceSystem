/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

public class Order {
    private int customerId;
    private int orderId;
    private Product[]products;
    private float totalPrice;

    public Order(int customerId, int orderId, Product[] products) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products ;
        this.totalPrice = Math.abs(totalPrice);
    }
    
    public void printOrderInfo(){
        System.out.println("order Id : "+orderId);
        System.out.println("customer Id : "+customerId);
        System.out.println("products : ");
        for(Product p : products){
            if(p!=null){
                System.out.println(""+p.getName() +" - " +"$"+p.getPrice());
            }
        }
        System.out.println("total Price : "+ "$"+getTotalPrice());  
    }

    public float getTotalPrice() {
         float totalPrice = 0;
         for(Product p: products){
             if(p!=null){
                 totalPrice +=p.getPrice();
             }
         }
        return totalPrice;
    } 
}
