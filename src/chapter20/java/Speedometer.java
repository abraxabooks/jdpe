package chapter20.java;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import java.util.*;

public class Speedometer extends Observable {

    private int speed;

    public Speedometer() {
        this.speed = 0;
    }

    public void setSpeed(int speed) {
        this.speed = speed;

        // Tell all observers so they know speed has changed...
        this.setChanged();
        this.notifyObservers();
    }

    public int getSpeed() {
        return this.speed;
    }

}
