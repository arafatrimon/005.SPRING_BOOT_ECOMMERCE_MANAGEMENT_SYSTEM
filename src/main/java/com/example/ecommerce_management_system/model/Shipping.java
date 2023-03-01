package com.example.ecommerce_management_system.model;

public class Shipping {
    // Shipping: This entity represents the shipping information associated with an order. It may include information such as shipping address, shipping method, and tracking number.


    private long shipping_id;
    //(foreign key to Order table)
    private String order_id;
    private String shipping_date;
    private String shipping_method;
    private String tracking_number;
    // (foreign key to Address table)
    private String shipping_address_id;
}
