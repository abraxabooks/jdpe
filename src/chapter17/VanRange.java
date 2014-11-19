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

public class VanRange implements Iterable<Vehicle> {

    private Vehicle[] vans;

    public VanRange() {
        this.vans = new Vehicle[3];

        Engine onePointSix = new StandardEngine(1600);
        Engine twoLitreTurbo = new TurboEngine(2000);

        this.vans[0] = new BoxVan(onePointSix);
        this.vans[1] = new BoxVan(twoLitreTurbo);
        this.vans[2] = new Pickup(twoLitreTurbo);
    }

    public Vehicle[] getRange() {
        return this.vans;
    }

    public Iterator<Vehicle> iterator() {
        return Arrays.asList(this.vans).listIterator();
    }

}
