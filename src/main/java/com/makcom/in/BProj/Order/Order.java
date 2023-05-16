package com.makcom.in.BProj.Order;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="OrderTab")
public class Order {
    @Id
    @GeneratedValue
    private  int order_id;
    private String order_by;
    private String shipping_addr;
    private String contact;
    private String product_name;
    private String product_price;
    private String status;
    public  Order(){

    }
    public Order(int order_id, String order_by, String shipping_addr, String contact, String product_name, String product_price,String status) {
        this.order_id = order_id;
        this.order_by = order_by;
        this.shipping_addr = shipping_addr;
        this.contact = contact;
        this.product_name = product_name;
        this.product_price = product_price;
        this.status = status;
    }

    public int getOrder_id() {
        return order_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOrder_by() {
        return order_by;
    }

    public void setOrder_by(String order_by) {
        this.order_by = order_by;
    }

    public String getShipping_addr() {
        return shipping_addr;
    }

    public void setShipping_addr(String shipping_addr) {
        this.shipping_addr = shipping_addr;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }
}
