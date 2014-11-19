package chapter21;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class MonthSetupState implements ClockSetupState {

    private ClockSetup clockSetup;
    private int month;

    public MonthSetupState(ClockSetup dashSetup) {
        this.clockSetup = dashSetup;
        this.month = 0; // January starts at zero in Java dates
    }

    public void rotateKnobLeft() {
        if (this.month > 0) {
            this.month--;
        }
    }

    public void rotateKnobRight() {
        if (this.month < 11) {
            this.month++;
        }
    }

    public void pushKnob() {
        System.out.println("Month set to " + this.month);
        this.clockSetup.setState(this.clockSetup.getDaySetupState());
    }

    public String getInstructions() {
        return "Please set the month...";
    }

    public int getSelectedValue() {
        return this.month;
    }

}
