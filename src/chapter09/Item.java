package chapter09;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public abstract class Item {

    private String description;
    private double cost;

    public Item(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return this.description;
    }

    public double getCost() {
        return this.cost;
    }

    public abstract void addItem(Item item);
    public abstract void removeItem(Item item);
    public abstract Item[] getItems();

    public boolean equals(Object other) {
        if (this == other) return true;
        if (! (other instanceof Item)) return false;
        Item otherItem = (Item) other;
        return (this.getDescription().equals(otherItem.getDescription()));
    }

    public int hashCode() {
        return this.getDescription().hashCode();
    }

    public String toString() {
        return (this.getClass().getSimpleName() +
                "[" +
                this.getDescription() +
                ", cost=" +
                this.getCost() +
                "]");
    }

}
