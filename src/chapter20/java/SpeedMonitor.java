package chapter20.java;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import java.util.*;

public class SpeedMonitor implements Observer {

    public static final int SPEED_TO_ALERT = 70;

    public void update(java.util.Observable obs, Object obj) {
        Speedometer speedo = (Speedometer) obs;
        if (speedo.getSpeed() > SPEED_TO_ALERT) {
            System.out.println("** ALERT ** Driving too fast! (" +
                                        speedo.getSpeed() + ")");
        } else {
            System.out.println("... nice and steady ... (" +
                                        speedo.getSpeed() + ")");
        }
    }

}
