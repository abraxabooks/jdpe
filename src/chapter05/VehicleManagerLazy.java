package chapter05;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class VehicleManagerLazy {

    private Vehicle saloon, coupe, sport, boxVan, pickup;

    public VehicleManagerLazy() {
    }

    public Vehicle createSaloon() {
        if (this.saloon == null) {
            this.saloon = new Saloon(new StandardEngine(1300));
            return this.saloon;
        } else {
            return (Vehicle) this.saloon.clone();
        }
    }

    public Vehicle createCoupe() {
        if (this.coupe == null) {
            this.coupe = new Coupe(new StandardEngine(1300));
            return this.coupe;
        } else {
            return (Vehicle) this.coupe.clone();
        }
    }

    public Vehicle createSport() {
        if (this.sport == null) {
            this.sport = new Coupe(new StandardEngine(1300));
            return this.sport;
        } else {
            return (Vehicle) this.sport.clone();
        }
    }

    public Vehicle createBoxVan() {
        if (this.boxVan == null) {
            this.boxVan = new BoxVan(new StandardEngine(1300));
            return this.boxVan;
        } else {
            return (Vehicle) this.boxVan.clone();
        }
    }

    public Vehicle createPickup() {
        if (this.pickup == null) {
            this.pickup = new Pickup(new StandardEngine(1300));
            return this.pickup;
        } else {
            return (Vehicle) this.pickup.clone();
        }
    }

}
