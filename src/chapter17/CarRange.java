package chapter17;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import java.util.*;
import chapter01.*;

public class CarRange implements Iterable<Vehicle> {

    private List<Vehicle> cars;

    public CarRange() {
        this.cars = new ArrayList<Vehicle>();

        Engine onePointThree = new StandardEngine(1300);
        Engine onePointSix = new StandardEngine(1600);
        Engine twoLitreTurbo = new TurboEngine(2000);

        this.cars.add(new Saloon(onePointThree));
        this.cars.add(new Saloon(onePointThree));
        this.cars.add(new Coupe(onePointSix));
        this.cars.add(new Coupe(twoLitreTurbo));
        this.cars.add(new Sport(twoLitreTurbo));
    }

    public List<Vehicle> getRange() {
        return this.cars;
    }

    public Iterator<Vehicle> iterator() {
        return this.cars.listIterator();
    }

}
