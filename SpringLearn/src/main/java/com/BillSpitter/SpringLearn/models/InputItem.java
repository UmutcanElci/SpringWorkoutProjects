package com.BillSpitter.SpringLearn.models;

import java.util.ArrayList;


public class InputItem {
    public String name;
    public Double price;
    public Integer quantity;
    public ArrayList<InputUser> users;

    public InputItem(String name, Double price, Integer quantity, ArrayList<InputUser> users) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.users = users;
    }
}
