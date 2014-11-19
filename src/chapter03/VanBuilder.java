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

public class VanBuilder extends VehicleBuilder {

    private AbstractVan vanInProgress;

    public VanBuilder(AbstractVan v) {
        this.vanInProgress = v;
    }

    public void buildBody() {
        // Add body to this.vanInProgress
    }

    public void buildChassis() {
        // Add chassis to this.vanInProgress
    }

    public void buildReinforcedStorageArea() {
        // Add storage area to this.vanInProgress
    }

    public void buildWindows() {
        // Add windows to this.vanInProgress
    }

    public Vehicle getVehicle() {
        return this.vanInProgress;
    }

}
