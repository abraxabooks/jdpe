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

public class Client {

    public static void main(String[] args) {
        // I want an economical car, coloured blue...
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.build
                (VehicleFactory.DrivingStyle.ECONOMICAL,
                 Vehicle.Colour.BLUE);

        // I am a "white van man"...
        VehicleFactory vanFactory = new VanFactory();
        Vehicle van = vanFactory.build
                (VehicleFactory.DrivingStyle.POWERFUL,
                 Vehicle.Colour.WHITE);

        // Create a red sports car...
        Vehicle sporty = VehicleFactory.make
                (VehicleFactory.Category.CAR,
                VehicleFactory.DrivingStyle.POWERFUL,
                Vehicle.Colour.RED);

        System.out.println(car);
        System.out.println(van);
        System.out.println(sporty);
    }

}
