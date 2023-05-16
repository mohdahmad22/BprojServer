package com.makcom.in.BProj.Product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="Product")
public class Product {

    @Id
    @GeneratedValue
    private int product_id;
    private String name;
    private double price;
    private String img_source;

    private String description;

    public Product(){

    }
    public Product(int product_id, String name, double price, String img_source, String description) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
        this.img_source = img_source;
        this.description = description;
    }
    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImg_source() {
        return img_source;
    }

    public void setImg_source(String img_source) {
        this.img_source = img_source;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
