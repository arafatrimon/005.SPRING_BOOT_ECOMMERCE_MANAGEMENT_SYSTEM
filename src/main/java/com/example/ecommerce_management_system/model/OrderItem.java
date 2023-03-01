package com.example.ecommerce_management_system.model;

public class OrderItem {
    private long order_item_id;
    // (foreign key to Order table)
    private String order_id;
    //(foreign key to Product table)
    private String product_id;
    private String quantity;
    private String price;
    private String subtotal_price;

}
