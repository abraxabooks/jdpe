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

public class AutomaticGearbox implements Observer {

    public void update(java.util.Observable obs, Object obj) {
        Speedometer speedo = (Speedometer) obs;
        if ((speedo.getSpeed() > 0) && (speedo.getSpeed() <= 10)) {
            System.out.println("Now in first gear");
        } else if ((speedo.getSpeed() > 10) && (speedo.getSpeed() <= 20)) {
            System.out.println("Now in second gear");
        } else if ((speedo.getSpeed() > 20) && (speedo.getSpeed() <= 30)) {
            System.out.println("Now in third gear");
        } else if (speedo.getSpeed() > 30) {
            System.out.println("Now in fourth gear");
        }
    }

}
