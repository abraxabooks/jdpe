package chapter08;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public abstract class AbstractDriverControls {

    private Engine engine;

    public AbstractDriverControls(Engine e) {
        this.engine = e;
    }

    public void ignitionOn() {
        this.engine.start();
    }

    public void ignitionOff() {
        this.engine.stop();
    }

    public void accelerate() {
        this.engine.increasePower();
    }

    public void brake() {
        this.engine.decreasePower();
    }

}
