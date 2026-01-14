package com.media.productservice;

public class Product {
    private String id;
    private String name;
    private double price;

    // This part is called a Constructor (for creating the product)
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

  // These are called Getters (so that the Gateway can read and display the data)
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

  // These are called Setters (to allow us to modify the data)
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

}
