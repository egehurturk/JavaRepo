package com.egehurturk;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item); // automatically adds the item into ArrayList
    }

    public void printList() {
        System.out.println("You have " + groceryList.size() + " items in grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i +1 + ". " + groceryList.get(i));
        }
    }

    public void replaceItem(String currentItem, String newItem) {
        int position = findItems(currentItem);
        if(position>=0) {
            replaceItem(position, newItem);
        }
    }

    private void replaceItem(int position, String item) {
        groceryList.set(position, item);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    private void removeItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public void removeItem(String item) {
        int position = findItems(item);
        if(position>=0) {
            removeItem(position);
        }
    }

    private int findItems(String searchItem) {
        return groceryList.indexOf(searchItem);
        // boolean exists = groceryList.contains(searchItem); <checks if it exists>
//        int position = groceryList.indexOf(searchItem); // returns the index of item
//        if(position >= 0) {
//            return groceryList.get(position);
//        }
//        return null;

    }

    public boolean onFile(String searchItem) {
        int pos = findItems(searchItem);
        return pos >= 0;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}


// ArrayList is a class;
// ArrayList stores objects that are inside <>;