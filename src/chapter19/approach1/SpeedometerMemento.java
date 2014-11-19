package chapter19.approach1;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class SpeedometerMemento {

    private Speedometer speedometer;

    private int copyOfSpeed;
    private int copyOfPreviousSpeed;

    public SpeedometerMemento(Speedometer s) {
        this.speedometer = s;
        this.copyOfSpeed = this.speedometer.getSpeed();
        this.copyOfPreviousSpeed = this.speedometer.previousSpeed;
    }

    public void restoreState() {
        this.speedometer.setSpeed(this.copyOfSpeed);
        this.speedometer.previousSpeed = this.copyOfPreviousSpeed;
    }

}
