package chapter18;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class Brake {

    private EngineManagementSystem mediator;
    private boolean enabled;
    private boolean applied;

    public Brake(EngineManagementSystem mediator) {
        this.mediator = mediator;
        this.enabled = false;
        this.applied = false;
        this.mediator.registerBrake(this);
    }

    public void enable() {
        this.enabled = true;
        System.out.println("Brakes enabled");
    }

    public void disable() {
        this.enabled = false;
        System.out.println("Brakes disabled");
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void apply() {
        if (this.isEnabled()) {
            this.applied = true;
            this.mediator.brakePressed();
            System.out.println("Now braking");
        }
    }

    public void release() {
        if (this.isEnabled()) {
            this.applied = false;
        }
    }

}
