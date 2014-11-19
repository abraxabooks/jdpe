package chapter18;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class Accelerator {

    private EngineManagementSystem mediator;
    private boolean enabled;
    private int speed;

    public Accelerator(EngineManagementSystem mediator) {
        this.mediator = mediator;
        this.enabled = false;
        this.speed = 0;
        this.mediator.registerAccelerator(this);
    }

    public void enable() {
        this.enabled = true;
        this.mediator.acceleratorEnabled();
        System.out.println("Accelerator enabled");
    }

    public void disable() {
        this.enabled = false;
        this.mediator.acceleratorDisabled();
        System.out.println("Accelerator disabled");
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void accelerateToSpeed(int speed) {
        if (this.isEnabled()) {
            this.speed = speed;
            this.mediator.acceleratorPressed();
            System.out.println("Speed now " + this.getSpeed());
       }
    }

    public int getSpeed() {
        return this.speed;
    }

}
