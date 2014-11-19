package chapter18;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class Ignition {

    private EngineManagementSystem mediator;
    private boolean on;

    public Ignition(EngineManagementSystem mediator) {
        this.mediator = mediator;
        this.on = false;
        this.mediator.registerIgnition(this);
    }

    public void start() {
        this.on = true;
        this.mediator.ignitionTurnedOn();
        System.out.println("Ignition turned on");
   }

    public void stop() {
        this.on = false;
        this.mediator.ignitionTurnedOff();
        System.out.println("Ignition turned off");
    }

    public boolean isOn() {
        return this.on;
    }

}
