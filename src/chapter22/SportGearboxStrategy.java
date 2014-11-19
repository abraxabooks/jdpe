package chapter22;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class SportGearboxStrategy implements GearboxStrategy {

    public void ensureCorrectGear(Engine engine, int speed) {
        int engineSize = engine.getSize();
        boolean turbo = engine.isTurbo();

        //  Some complicated code to determine correct gear
        //  setting based on engineSize, turbo & speed, etc.
        //  ... omitted ...

        System.out.println("Working out correct gear at " +
                            speed + "mph for a SPORT gearbox");
    }

}
