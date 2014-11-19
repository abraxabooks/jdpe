package chapter03;

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
        AbstractCar car = new Saloon(new StandardEngine(1300));
        VehicleBuilder builder = new CarBuilder(car);
        VehicleDirector director = new CarDirector(builder);
        director.build();
        Vehicle v = builder.getVehicle();
        System.out.println(v);
    }

}
