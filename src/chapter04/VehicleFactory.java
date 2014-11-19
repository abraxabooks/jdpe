package chapter04;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import chapter01.*;

public abstract class VehicleFactory {

    public enum DrivingStyle {ECONOMICAL, MIDRANGE, POWERFUL};
    public enum Category {CAR, VAN};

    public static Vehicle make(Category cat,
                               DrivingStyle style,
                               Vehicle.Colour colour) {

        VehicleFactory factory;

        if (cat.equals(Category.CAR)) {
            factory = new CarFactory();

        } else if (cat.equals(Category.VAN)) {
            factory = new VanFactory();

        } else {
            throw new IllegalArgumentException("Category not recognised");
        }

        return factory.build(style, colour);
    }

    public Vehicle build(DrivingStyle style, Vehicle.Colour colour) {
        Vehicle v = this.selectVehicle(style);
        v.paint(colour);
        return v;
    }

    // This is the "factory method"
    protected abstract Vehicle selectVehicle(DrivingStyle style);

}
