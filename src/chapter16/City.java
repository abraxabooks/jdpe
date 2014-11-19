package chapter16;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class City {

    private String name;
    private double latitude, longitude;

    public City(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return this.name;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (! (otherObject instanceof City)) return false;
        City otherCity = (City) otherObject;
        return this.getName().equals(otherCity.getName());
    }

    public int hashCode() {
        return this.getName().hashCode();
    }

    public String toString() {
        return this.getName();
    }

}
