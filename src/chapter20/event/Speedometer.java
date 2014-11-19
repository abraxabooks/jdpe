package chapter20.event;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import java.util.*;

public class Speedometer {

    private int speed;
    private List<SpeedometerListener> listeners;

    public Speedometer() {
        this.speed = 0;
        this.listeners = new ArrayList<SpeedometerListener>();
    }

    public void setSpeed(int speed) {
        this.speed = speed;

        // Tell all observers so they know speed has changed...
        this.fireSpeedChanged();
    }

    public int getSpeed() {
        return this.speed;
    }

    public void addSpeedometerListener(SpeedometerListener obj) {
        this.listeners.add(obj);
    }

    public void removeSpeedometerListener(SpeedometerListener obj) {
        this.listeners.remove(obj);
    }

    public void fireSpeedChanged() {
        SpeedometerEvent speedEvent =
                new SpeedometerEvent(this, this.getSpeed());

        for (SpeedometerListener eachListener : this.listeners) {
            eachListener.speedChanged(speedEvent);
        }
    }

}
