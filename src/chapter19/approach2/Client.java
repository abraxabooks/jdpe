package chapter19.approach2;

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
        Speedometer speedo = new Speedometer();

        try {
            speedo.setSpeed(50);
            speedo.setSpeed(100);
            System.out.println("Current speed: " + speedo.getSpeed());
            System.out.println("Previous speed: " + speedo.getPreviousSpeed());

            SpeedometerMemento memento = new SpeedometerMemento(speedo);

            speedo.setSpeed(80);
            System.out.println("After setting to 80...");
            System.out.println("Current speed: " + speedo.getSpeed());
            System.out.println("Previous speed: " + speedo.getPreviousSpeed());

            System.out.println("Now restoring state...");
            speedo = memento.restoreState();
            System.out.println("Current speed: " + speedo.getSpeed());
            System.out.println("Previous speed: " + speedo.getPreviousSpeed());

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
