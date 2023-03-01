package com.example.ecommerce_management_system.model;

public class Payment {
    //Payment: This entity represents the payment information associated with an order. It may include information such as payment type, card number, expiration date, and billing address.


    private long payment_id;
    //(foreign key to Order table)
    private String order_id;
    private String payment_date;
    private String payment_type;
    private String card_number;
    private String expiration_date;
    //(foreign key to Address table)
    private String billing_address_id;

}
