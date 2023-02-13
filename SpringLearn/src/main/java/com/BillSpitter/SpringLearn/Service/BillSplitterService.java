package com.BillSpitter.SpringLearn.Service;

import com.BillSpitter.SpringLearn.models.InputItem;
import com.BillSpitter.SpringLearn.models.InputUser;
import com.BillSpitter.SpringLearn.models.OutputItem;
import com.BillSpitter.SpringLearn.models.OutputUser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
    private static ArrayList<OutputUser> getOutputUsers(HashMap<String,ArrayList<InputItem>> usersToItems){
        for(Map.Entry<String,ArrayList<InputItem>> singleUserToItems : usersToItems.entrySet()){
            String userName = singleUserToItems.getKey();
            ArrayList<InputItem> userItems = singleUserToItems.getValue();

            double totalPayableToUser = 0.0;
            //for each item a user is contributing to, calculate the price the user has to pay
            for (InputItem items : userItems){
                //totalItemPrice is the product of price and quantity
                Double currentItemPrice = items.price * items.quantity;
                // Item Contributors
                ArrayList<InputUser> itemContributors = items.users;
                Integer usersContributing = itemContributors.size();
                //Represents the price the user needs to pay for this item
                double itemPayableToUser = currentItemPrice / usersContributing;

                totalPayableToUser += itemPayableToUser;
            }

            ArrayList<OutputItem> outputUserItems = new ArrayList<>();

            OutputItem outputItem = new OutputItem();
            outputUserItems.add();

            OutputUser currOutputUser = new OutputUser(userName,totalPayableToUser,userItems);
        }
    }
    public static ArrayList<OutputUser> splitBill(ArrayList<InputItem> items){
        HashMap<String,ArrayList<InputItem>> userToItems = BillSplitterService.getUserToItems(items);
    }
}
