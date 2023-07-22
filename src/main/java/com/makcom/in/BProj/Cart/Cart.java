package com.makcom.in.BProj.Cart;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="Cart")
public class Cart {
    @Id
    @GeneratedValue
    private int cart_id;
    private String quantity;
    private int product_id;
    private int user_id;
    public Cart(){

    }

    public Cart(int cart_id, String quantity, int product_id, int user_id) {
        this.cart_id = cart_id;
        this.quantity = quantity;
        this.product_id = product_id;
        this.user_id = user_id;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
