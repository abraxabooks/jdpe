package chapter25;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class OilLevelLight implements WarningLight {

    public void on() {
        System.out.println("Oil level light ON");
    }

    public void off() {
        System.out.println("Oil level light OFF");
    }

}
