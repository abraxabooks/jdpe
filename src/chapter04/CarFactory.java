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

public class CarFactory extends VehicleFactory {

    protected Vehicle selectVehicle(DrivingStyle style) {
        Vehicle selectedVehicle;

        if (style.equals(DrivingStyle.ECONOMICAL)) {
            selectedVehicle = new Saloon(new StandardEngine(1300));

        } else if (style.equals(DrivingStyle.MIDRANGE)) {
            selectedVehicle = new Coupe(new StandardEngine(1600));

        } else if (style.equals(DrivingStyle.POWERFUL)) {
            selectedVehicle = new Sport(new TurboEngine(2000));

        } else {
            throw new IllegalArgumentException("DrivingStyle not recognised");
        }

        return selectedVehicle;
    }

}
