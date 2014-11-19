package chapter17;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import java.util.*;
import chapter01.*;

public class Brochure {

    public static void main(String[] args) {
        Brochure b = new Brochure();
        b.print3();
    }

    public void print() {
        System.out.println("=== Our Cars ===");
        CarRange carRange = new CarRange();
        List<Vehicle> cars = carRange.getRange();
        ListIterator carIterator = cars.listIterator();
        while (carIterator.hasNext()) {
            System.out.println(carIterator.next());
        }

        System.out.println("=== Our Vans ===");
        VanRange vanRange = new VanRange();
        Vehicle[] vans = vanRange.getRange();
        for (int i = 0; i < vans.length; i++) {
            System.out.println(vans[i]);
        }
    }

    public void print2() {
        System.out.println("=== Our Cars ===");
        CarRange carRange = new CarRange();
        this.printIterator(carRange.iterator());

        System.out.println("=== Our Vans ===");
        VanRange vanRange = new VanRange();
        this.printIterator(vanRange.iterator());
    }

    public void printIterator(Iterator iter) {
         while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public void print3() {
        System.out.println("=== Our Cars ===");
        CarRange carRange = new CarRange();
        for (Vehicle currentVehicle : carRange.getRange()) {
            System.out.println(currentVehicle);
        }

        System.out.println("=== Our Vans ===");
        VanRange vanRange = new VanRange();
        for (Vehicle currentVehicle : vanRange.getRange()) {
            System.out.println(currentVehicle);
        }
    }

}
