package chapter21;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import java.util.*;

public class ClockSetup {

    // The various states the setup can be in...
    private ClockSetupState yearState;
    private ClockSetupState monthState;
    private ClockSetupState dayState;
    private ClockSetupState hourState;
    private ClockSetupState minuteState;
    private ClockSetupState finishedState;

    // The current state we are in...
    private ClockSetupState currentState;


    public ClockSetup() {
        this.yearState = new YearSetupState(this);
        this.monthState = new MonthSetupState(this);
        this.dayState = new DaySetupState(this);
        this.hourState = new HourSetupState(this);
        this.minuteState = new MinuteSetupState(this);
        this.finishedState = new FinishedSetupState(this);

        // Initial state is to set the year
        this.setState(yearState);
    }

    public void setState(ClockSetupState state) {
        this.currentState = state;
        System.out.println(this.currentState.getInstructions());
    }

    public void rotateKnobLeft() {
        this.currentState.rotateKnobLeft();
    }

    public void rotateKnobRight() {
        this.currentState.rotateKnobRight();
    }

    public void pushKnob() {
        this.currentState.pushKnob();
    }

    public ClockSetupState getYearSetupState() {
        return this.yearState;
    }

    public ClockSetupState getMonthSetupState() {
        return this.monthState;
    }

    public ClockSetupState getDaySetupState() {
        return this.dayState;
    }

    public ClockSetupState getHourSetupState() {
        return this.hourState;
    }

    public ClockSetupState getMinuteSetupState() {
        return this.minuteState;
    }

    public ClockSetupState getFinishedSetupState() {
        return this.finishedState;
    }

    public Calendar getSelectedDate() {
        return new GregorianCalendar(
                        this.yearState.getSelectedValue(),
                        this.monthState.getSelectedValue(),
                        this.dayState.getSelectedValue(),
                        this.hourState.getSelectedValue(),
                        this.minuteState.getSelectedValue());
    }

}
