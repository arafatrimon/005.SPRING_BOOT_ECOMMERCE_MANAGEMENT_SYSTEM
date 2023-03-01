package com.example.ecommerce_management_system.model;

public class Wishlist {
    //Wishlist: This entity represents the wishlists used by users to save products they are interested in purchasing in the future. It may include information such as user ID, product ID, and date added.

    private long wishlist_id;
    //(foreign key to User table)
    private String user_id;
    // (foreign key to Product table)
    private String product_id;
    private String date_added;
}
