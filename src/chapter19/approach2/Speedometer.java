package chapter19.approach2;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class Speedometer implements java.io.Serializable {

    private int speed;
    private int previousSpeed;

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

    public int getPreviousSpeed() {
        return this.previousSpeed;
    }

}
