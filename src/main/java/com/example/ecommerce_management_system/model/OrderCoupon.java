package com.example.ecommerce_management_system.model;

public class OrderCoupon {
//(primary key)
   private long order_coupon_id ;
        //(foreign key to Order table)
   private String order_id;
    //(foreign key to Coupon table)
  private String  coupon_id ;
}
