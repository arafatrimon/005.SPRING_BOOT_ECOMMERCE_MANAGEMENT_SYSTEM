package com.example.ecommerce_management_system.model;

public class Order {
    //Order: This entity represents the orders placed by users on the eCommerce platform. It may include information such as order number, user ID, product ID, quantity, price, and order status.
//(primary key)
   private long order_id;
 //(foreign key to User table)
   private String user_id;
    private String order_date;
    private String     status;

    private String order_item_id;

    //(foreign key to Product table)
    private String  product_id;
    private String   quantity;
    private String         price;
    //(foreign key to Address table)
    private String shipping_address_id;
    // (foreign key to Address table)
    private String   billing_address_id;
    private String  shipping_cost;
    private String   tax;

}
