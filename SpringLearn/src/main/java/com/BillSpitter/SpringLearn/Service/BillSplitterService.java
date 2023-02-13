package com.BillSpitter.SpringLearn.Service;

import com.BillSpitter.SpringLearn.models.InputItem;
import com.BillSpitter.SpringLearn.models.InputUser;
import com.BillSpitter.SpringLearn.models.OutputUser;

import java.util.ArrayList;
import java.util.HashMap;

public class BillSplitterService {
    /*
    Responsibility: Take in an ArrayList<InputItems>, returns ArrayList<OutputUser>
     */
    private  static  HashMap<String , ArrayList<InputItem>> getUserToItems(ArrayList<InputItem> items){
        //This hashmap key is the user's name and the value, is the arraylist of items this user is contributing to
        HashMap<String,ArrayList<InputItem>> userToItems = new HashMap<>();

        //For each of the input items, we are appending the item to each user's userToItems arrayList;
        //This lets us keep track of which items each user is contributing to
        for (InputItem item : items){
            for (InputUser users : item.users){
                //For each of this user , append the current item into the userToItems hashmap
                ArrayList<InputItem> currentUserItems = userToItems.getOrDefault(users.name,new ArrayList<InputItem>());
                currentUserItems.add(item);
                userToItems.put(users.name,currentUserItems);
            }
        }
        return userToItems;
    }
    public static ArrayList<OutputUser> splitBill(ArrayList<InputItem> items){
        HashMap<String,ArrayList<InputItem>> userToItems = BillSplitterService.getUserToItems(items);
    }
}
