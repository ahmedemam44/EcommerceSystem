/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

public class Cart {
    
    private int customerId;
    private int nProducts;
    private Product[]products;

    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        this.products = new Product[this.nProducts];
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    
    public void addProduct(int i,Product p){
        if(i >=0 && i < nProducts){
            products[i]=p;
        }else{
             System.out.println("Invalid index for adding product.");
        }
    }
    
    public void removeProduct(int i){
        if(i>=0 && i < nProducts ){
             products[i]=null;
        }else{
            System.out.println("Invalid index for removing product.");
        }
    }
    
    public float calculatePrice(){
        float total_price=0;
        for(Product p : products){
            if(p != null){
                total_price += p.getPrice();
            }
        }
        return total_price;
    }
    
    public void placeOrder(){
        Order o1 = new Order( customerId,1,products);
            o1.printOrderInfo();
        System.out.println(" Here's your arder's summery" );
    }
}
