package com.BillSpitter.SpringLearn.models;

import java.util.ArrayList;

public class OutputItem {
    String name;
    Double price;
    Integer quantity;
    ArrayList<SlimOutputUser> users;

    public OutputItem(String name, Double price, Integer quantity, ArrayList<SlimOutputUser> users) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.users = users;
    }
}
