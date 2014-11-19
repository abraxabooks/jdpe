package chapter21;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class HourSetupState implements ClockSetupState {

    private ClockSetup clockSetup;
    private int hour;

    public HourSetupState(ClockSetup dashSetup) {
        this.clockSetup = dashSetup;
        this.hour = 12; // noon
    }

    public void rotateKnobLeft() {
        if (this.hour > 0) {
            this.hour--;
        }
    }

    public void rotateKnobRight() {
        if (this.hour < 23) {
            this.hour++;
        }
    }

    public void pushKnob() {
        System.out.println("Hour set to " + this.hour);
        this.clockSetup.setState(this.clockSetup.getMinuteSetupState());
    }

    public String getInstructions() {
        return "Please set the hour...";
    }

    public int getSelectedValue() {
        return this.hour;
    }

}
