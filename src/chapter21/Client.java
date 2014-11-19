package chapter21;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class Client {

    public static void main(String[] args) {
        ClockSetup clockSetup = new ClockSetup();

        // Setup starts in 'year' state
        clockSetup.rotateKnobRight(); // should now be year 2011
        clockSetup.pushKnob();

        // Setup should now be in 'month' state
        clockSetup.rotateKnobRight(); // should now be month 2
        clockSetup.rotateKnobRight(); // should now be month 3
        clockSetup.pushKnob();

        // Setup should now be in 'day' state
        clockSetup.rotateKnobRight(); // should now be day 2
        clockSetup.rotateKnobRight(); // should now be day 3
        clockSetup.rotateKnobRight(); // should now be day 4
        clockSetup.pushKnob();

        // Setup should now be in 'hour' state
        clockSetup.rotateKnobLeft(); // should now be hour 11
        clockSetup.rotateKnobLeft(); // should now be hour 10
        clockSetup.pushKnob();

        // Setup should now be in 'minute' state
        clockSetup.rotateKnobRight(); // should now be minute 1
        clockSetup.pushKnob();

        // Setup should now be in 'finished' state
        clockSetup.pushKnob(); // to display selected date
    }

}
