package chapter21;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class MinuteSetupState implements ClockSetupState {

    private ClockSetup clockSetup;
    private int minute;

    public MinuteSetupState(ClockSetup dashSetup) {
        this.clockSetup = dashSetup;
        this.minute = 0; // minutes start at zero in Java
    }

    public void rotateKnobLeft() {
        if (this.minute > 1) {
            this.minute--;
        }
    }

    public void rotateKnobRight() {
        if (this.minute < 60) {
            this.minute++;
        }
    }

    public void pushKnob() {
        System.out.println("Minute set to " + this.minute);
        this.clockSetup.setState(this.clockSetup.getFinishedSetupState());
    }

    public String getInstructions() {
        return "Please set the minute...";
    }

    public int getSelectedValue() {
        return this.minute;
    }

}
