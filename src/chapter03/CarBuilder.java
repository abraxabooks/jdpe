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

public class CarBuilder extends VehicleBuilder {

    private AbstractCar carInProgress;

    public CarBuilder(AbstractCar c) {
        this.carInProgress = c;
    }

    public void buildBody() {
        // Add body to this.carInProgress
    }

    public void buildBoot() {
        // Add boot to this.carInProgress
    }

    public void buildChassis() {
        // Add chassis to this.carInProgress
    }

    public void buildPassengerArea() {
        // Add passenger area to this.carInProgress
    }

    public void buildWindows() {
        // Add windows to this.carInProgress
    }

    public Vehicle getVehicle() {
        return this.carInProgress;
    }

}
