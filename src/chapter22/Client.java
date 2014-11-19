package chapter22;

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
        AbstractCar myCar = new Sport(new StandardEngine(2000));
        myCar.setSpeed(20);
        myCar.setSpeed(40);

        System.out.println("Switching on sports mode gearbox...");
        myCar.setGearboxStrategy(new SportGearboxStrategy());
        myCar.setSpeed(20);
        myCar.setSpeed(40);
    }

}
