package chapter10;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public abstract class AbstractVehicleOption extends AbstractVehicle {

    protected Vehicle decoratedVehicle;

    public AbstractVehicleOption(Vehicle v) {
        super(v.getEngine());
        this.decoratedVehicle = v;
    }

    public String toString() {
        StringBuilder description
                    = new StringBuilder(this.decoratedVehicle.toString());
        int closingSquareBracketPosition
                    = description.lastIndexOf("]");
        description.insert
                (closingSquareBracketPosition,
                ", " + this.getClass().getSimpleName() +
                ", " + this.getPrice());
        return description.toString();
    }

}
