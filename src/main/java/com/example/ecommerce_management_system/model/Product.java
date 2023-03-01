package com.example.ecommerce_management_system.model;

public class Product {
    //Product: This entity represents the products that are available for purchase on the eCommerce platform. It may include information such as name, description, price, image, and inventory levels.

    //(primary key)
    private long product_id;
    private String name;
    private String description;
    private String price;
    private String image_url;
    // (foreign key to Category table)
    private String category_id;
    // (foreign key to Supplier table)
    private String supplier_id;
    private String quantity_in_stock;

    private String weight;
    private String     height;
    private String   width;
    private String     length;

}
