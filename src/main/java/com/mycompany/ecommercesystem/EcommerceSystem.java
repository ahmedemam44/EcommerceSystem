/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecommercesystem;


import java.util.Scanner;
public class EcommerceSystem {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
 
       ElectronicProduct E1 = new ElectronicProduct("Samsung",1,1,"smartphone",599.9f);
       
       ClothingProduct c1 = new ClothingProduct("Medium","Cotton",2,"T-shirt",19.99f);
       
       BookProduct B1 = new BookProduct("O’Reilly","X Publications",3,"OOP",39.99f);
       
        System.out.println("welcome to E-commerce system ");
       
        System.out.println(" enter id : ");
            int x =input.nextInt();
        System.out.println(" name : ");
            String n =input.nextLine();
        input.nextLine();    
        System.out.println("address : ");
            String d =input.nextLine();
            
        Customer r = new Customer(x,n,d);     
        
        System.out.println("How many products do you want to order ? ");
            int num =input.nextInt();
        
        Cart cart = new Cart(x,num);
        
        for(int i =0; i<num ; i++){
            
            System.out.println("Enter product type 1-Electronic  2- Clothing 3- Book):");
            int type=input.nextInt();
            input.nextLine(); 
            switch(type){
                case 1:
                    cart.addProduct(i,E1 );
                    break;
                case 2:
                    cart.addProduct(i, c1);
                    break;
                case 3:
                    cart.addProduct(i, B1);
                    break;
                default:
                      System.out.println("Invalid product type."); 
            }
        }
       
         System.out.println("would you want to place an order ? (yes/no)");
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("yes")){
            cart.placeOrder();
            
        }else{
            System.out.println("Order not placed.");
        }
    }
}
