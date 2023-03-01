package com.example.ecommerce_management_system.model;

public class Supplier {

    private long supplier_id;
    private String name;
    private String email;
    private String phone;
    //(foreign key to Address table)
    private String address_id;
}
