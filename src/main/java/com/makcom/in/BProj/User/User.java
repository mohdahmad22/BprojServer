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
    private String password;

    public User(){

    }

    public User(String name, int user_d, String address,String password) {
        this.name = name;
        this.user_d = user_d;
        this.address = address;
        this.password=password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
