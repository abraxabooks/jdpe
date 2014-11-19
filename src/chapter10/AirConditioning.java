package chapter10;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class AirConditioning extends AbstractVehicleOption {

    public AirConditioning(Vehicle v) {
        super(v);
    }

    public double getPrice() {
        return this.decoratedVehicle.getPrice() + 600.0;
    }

    public void setTemperature(int value) {
        // code to set the temperature...
    }

}
