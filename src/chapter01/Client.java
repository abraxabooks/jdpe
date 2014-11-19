package chapter01;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import java.util.*;

public class Client {

    public static void main(String[] args) {
        List<AbstractEngine> engines = new ArrayList();
        engines.add(new StandardEngine(1300));
        engines.add(new StandardEngine(1600));
        engines.add(new TurboEngine(2000));
        System.out.println(engines);

        List<AbstractVehicle> vehicles = new ArrayList();
        vehicles.add(new Saloon(new StandardEngine(1100)));
        vehicles.add(new Coupe(new TurboEngine(1800)));
        vehicles.add(new Sport(new TurboEngine(2500)));
        vehicles.add(new BoxVan(new TurboEngine(2200)));
        vehicles.add(new Pickup(new StandardEngine(2000)));
        System.out.println(vehicles);

        System.out.println(new StandardEngine(1300));
        System.out.println(new TurboEngine(2000));

        Vehicle redCar = new Saloon(new StandardEngine(1300));
        redCar.paint(Vehicle.Colour.RED);
        System.out.println(redCar);

        Vehicle whiteVan = new BoxVan(new TurboEngine(2200));
        whiteVan.paint(Vehicle.Colour.WHITE);
        System.out.println(whiteVan);
    }

}
