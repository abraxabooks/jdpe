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

public class FinishedSetupState implements ClockSetupState {

    private ClockSetup clockSetup;

    public FinishedSetupState(ClockSetup dashSetup) {
        this.clockSetup = dashSetup;
    }

    public void rotateKnobLeft() {
        System.out.println("Ignored...");
    }

    public void rotateKnobRight() {
        System.out.println("Ignored...");
    }

    public void pushKnob() {
        Calendar selectedDate = this.clockSetup.getSelectedDate();
        System.out.println("Date set to: " + selectedDate.getTime());
    }

    public String getInstructions() {
        return "Press knob to view selected date...";
    }

    public int getSelectedValue() {
        throw new IllegalStateException("Clock setup finished");
    }

}
