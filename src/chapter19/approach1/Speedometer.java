package chapter19.approach1;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class Speedometer {

    private int speed;

    int previousSpeed; // package protected visibility

    public Speedometer() {
        this.speed = 0;
        this.previousSpeed = 0;
    }

    public void setSpeed(int speed) {
        this.previousSpeed = this.speed;
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

}
