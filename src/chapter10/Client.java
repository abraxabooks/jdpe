package chapter10;

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
        Vehicle myCar1 = new Saloon(new StandardEngine(1300));
        myCar1.paint(Vehicle.Colour.BLUE);

        AirConditioning myCar2 = new AirConditioning(myCar1);
        AlloyWheels myCar3 = new AlloyWheels(myCar2);
        LeatherSeats myCar4 = new LeatherSeats(myCar3);
        MetallicPaint myCar5 = new MetallicPaint(myCar4);
        SatNav myCar6 = new SatNav(myCar5);

        System.out.println(myCar1);
        System.out.println(myCar2);
        System.out.println(myCar3);
        System.out.println(myCar4);
        System.out.println(myCar5);
        System.out.println(myCar6);
    }

}
