package chapter21;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class YearSetupState implements ClockSetupState {

    private ClockSetup clockSetup;
    private int year;

    public YearSetupState(ClockSetup dashSetup) {
        this.clockSetup = dashSetup;
        this.year = 2010; // default year
    }

    public void rotateKnobLeft() {
        this.year--;
    }

    public void rotateKnobRight() {
        this.year++;
    }

    public void pushKnob() {
        System.out.println("Year set to " + this.year);
        this.clockSetup.setState(this.clockSetup.getMonthSetupState());
    }

    public String getInstructions() {
        return "Please set the year...";
    }

    public int getSelectedValue() {
        return this.year;
    }

}
