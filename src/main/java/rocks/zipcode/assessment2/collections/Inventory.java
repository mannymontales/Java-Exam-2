package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */
   //Map<String, List<String>> inventory;
    //Map<List<String>, Integer> inventory;
    //Map<List<String>, String> inventory;
    Map<String, List<String>> inventory;
   List<String> amount;


    public Inventory(Map<String, List<String>>map){
        this.inventory = map;
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
    }

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        this.amount = strings;

    }



    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {

        if (this.amount.contains(item)){
            this.amount.add(item);
        }
        return;
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        return;
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {

        int counter = 0;
        addItemToInventory(item);

        for (String element: this.amount){
            if (this.amount.contains(item)){
                counter++;
            }
        }

        return counter;
    }
}
