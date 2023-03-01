package com.example.ecommerce_management_system.model;

public class Promotions {
    //Promotions: This entity represents the promotions that are offered on the eCommerce platform. It may include information such as promotion code, discount amount, and expiration date.
   private long promotion_id ;
   private String  promotion_code;
    private String    discount_amount;
    private String   start_date;
    private String          end_date;

    private String    discount_type;
    private String    minimum_order_amount;
}
