package chapter10;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class Saloon extends AbstractCar {

    public Saloon(Engine engine) {
        super(engine);
    }

    public Saloon(Engine engine, Vehicle.Colour colour) {
        super(engine, colour);
    }

     public double getPrice() {
        return 6000;
    }
    
}
