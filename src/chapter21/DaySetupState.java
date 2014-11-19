package chapter21;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class DaySetupState implements ClockSetupState {

    private ClockSetup clockSetup;
    private int day;

    public DaySetupState(ClockSetup dashSetup) {
        this.clockSetup = dashSetup;
        this.day = 1;
    }

    public void rotateKnobLeft() {
        if (this.day > 1) {
            this.day--;
        }
    }

    public void rotateKnobRight() {
        // Note: for simplicity this method does not check
        //       that the day is valid for the month, but you
        //       could easily get access to the selected month
        //       through the 'context':
        //    this.clockSetup.getMonthSetupState().getSelectedValue();
        if (this.day < 31) {
            this.day++;
        }
    }

    public void pushKnob() {
        System.out.println("Day set to " + this.day);
        this.clockSetup.setState(this.clockSetup.getHourSetupState());
    }

    public String getInstructions() {
        return "Please set the day...";
    }

    public int getSelectedValue() {
        return this.day;
    }

}
