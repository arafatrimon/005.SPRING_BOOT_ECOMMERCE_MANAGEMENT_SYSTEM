package com.example.ecommerce_management_system.model;

public class Category {
    //Category: This entity represents the categories in which products are organized. It may include information such as name, description, and parent category.

    //(primary key)
    private long category_id;
    private String name;
    //(foreign key to Category table)
    private String parent_category_id;
}
