package com.example.ecommerce_management_system.model;

public class Cart {
    //Cart: This entity represents the shopping cart used by users to temporarily store products they wish to purchase. It may include information such as user ID, product ID, quantity, and price.
//(primary key)
  private long  cart_id ;
  //(foreign key to User table)
   private String user_id ;
   //(foreign key to Product table)
    private String    product_id ;
    private String  quantity;
    private String      date_added;
}
