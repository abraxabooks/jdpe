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

public class CarDirector extends VehicleDirector {

    public CarDirector(VehicleBuilder builder) {
        super(builder);
    }

    public Vehicle build() {
        this.builder.buildChassis();
        this.builder.buildBody();
        this.builder.buildPassengerArea();
        this.builder.buildBoot();
        this.builder.buildWindows();
        return this.builder.getVehicle();
    }

}
