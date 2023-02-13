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

    //Overloaded Contructor , takes in another input item and constructs an OutputItem
    public OutputItem(InputItem inputItem){
        this.name = inputItem.name;
        this.price = inputItem.price;
        this.quantity = inputItem.quantity;
        ArrayList<SlimOutputUser> listOfUsers = new ArrayList<>();

        for (InputUser inputUser : inputItem.users){
            SlimOutputUser outputUser = new SlimOutputUser(inputUser);
            listOfUsers.add(outputUser);
        }
        this.users = listOfUsers;
    }
}
