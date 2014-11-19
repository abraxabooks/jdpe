package chapter18;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class Gearbox {

    public enum Gear {NEUTRAL,
                      FIRST, SECOND, THIRD, FOURTH, FIFTH,
                      REVERSE};

    private EngineManagementSystem mediator;
    private boolean enabled;
    private Gear currentGear;

    public Gearbox(EngineManagementSystem mediator) {
        this.mediator = mediator;
        this.enabled = false;
        this.currentGear = Gear.NEUTRAL;
        this.mediator.registerGearbox(this);
    }

    public void enable() {
        this.enabled = true;
        this.mediator.gearboxEnabled();
        System.out.println("Gearbox enabled");
    }

    public void disable() {
        this.enabled = false;
        this.mediator.gearboxDisabled();
        System.out.println("Gearbox disabled");
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setGear(Gear g) {
        if ((this.isEnabled()) && (this.getGear() != g)) {
            this.currentGear = g;
            this.mediator.gearChanged();
            System.out.println("Now in " + this.getGear() + " gear");
       }
    }
    public Gear getGear() {
        return this.currentGear;
    }

}
