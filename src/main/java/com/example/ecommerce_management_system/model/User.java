package com.example.ecommerce_management_system.model;

public class User {

    // User: This entity represents the people who use the eCommerce software. It may include information such as name, email address, password, billing information, shipping information, and order history.

    // (primary key)
    private long user_id;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    //(foreign key to Address table)
    private String billing_address_id;
    // (foreign key to Address table)
    private String shipping_address_id;

//    street_address
//            city
//    state
//            country
//    zip_code
}
