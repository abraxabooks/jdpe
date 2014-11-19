package chapter26;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class GearboxFactory {

    public enum Type {AUTOMATIC, MANUAL};

    public static Gearbox create(Type type) {
        Gearbox gearbox;

        if (type.equals(Type.AUTOMATIC)) {
            gearbox = new AutomaticGearbox();

        } else if (type.equals(Type.MANUAL)) {
            gearbox = new ManualGearbox();
        
        } else {
            // Should not reach here...
            gearbox = new NullGearbox();
        }

        return gearbox;
    }

}
