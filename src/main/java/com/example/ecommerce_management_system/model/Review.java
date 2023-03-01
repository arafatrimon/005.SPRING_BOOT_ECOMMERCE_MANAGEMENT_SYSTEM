package com.example.ecommerce_management_system.model;

public class Review {
    //Review: This entity represents the reviews that users can leave for products on the eCommerce platform. It may include information such as user ID, product ID, rating, and comment.


    private long review_id;
    //(foreign key to User table)
   private String user_id;
    //(foreign key to Product table)
    private String product_id;
    private String  rating;
    private String      comment;
    private String review_date;
}
