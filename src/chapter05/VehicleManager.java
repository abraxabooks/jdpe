package chapter05;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class VehicleManager {

    private Vehicle saloon, coupe, sport, boxVan, pickup;

    public VehicleManager() {
        // For simplicity all vehicles use same engine type...
        this.saloon = new Saloon(new StandardEngine(1300));
        this.coupe = new Coupe(new StandardEngine(1300));
        this.sport = new Sport(new StandardEngine(1300));
        this.boxVan = new BoxVan(new StandardEngine(1300));
        this.pickup = new Pickup(new StandardEngine(1300));
    }

    public Vehicle createSaloon() {
        return (Vehicle) this.saloon.clone();
    }

    public Vehicle createCoupe() {
        return (Vehicle) this.coupe.clone();
    }

    public Vehicle createSport() {
        return (Vehicle) this.sport.clone();
    }

    public Vehicle createBoxVan() {
        return (Vehicle) this.boxVan.clone();
    }

    public Vehicle createPickup() {
        return (Vehicle) this.pickup.clone();
    }

}
