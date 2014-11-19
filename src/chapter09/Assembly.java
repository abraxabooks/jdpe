package chapter09;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import java.util.*;

public class Assembly extends Item {

    public List<Item> itemList;

    public Assembly(String description) {
        super(description, 0.0);
        this.itemList = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public void removeItem(Item item) {
        this.itemList.remove(item);
    }

    public AbstractItem[] getItems() {
        return this.itemList.toArray(new Item[this.itemList.size()]);
    }

    // Also have to override getCost() to add cost of items in list
    public double getCost() {
        double totalCost = 0;
        for (Item eachItem : this.itemList) {
            totalCost += eachItem.getCost();
        }
        return totalCost;
    }
}
