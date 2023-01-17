package com.makcom.in.BProj.User;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="muser")
public class User {
    private String name;
    @Id
    @GeneratedValue
    private int user_d;
    private String address;

    public User(){

    }

    public User(String name, int user_d, String address) {
        this.name = name;
        this.user_d = user_d;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUser_d() {
        return user_d;
    }

    public void setUser_d(int user_d) {
        this.user_d = user_d;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
