package chapter12;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import java.awt.*;

public class Client {

    public static void main(String[] args) {

        Engine e1 = new StandardEngine(1300);
        Engine e2 = new StandardEngine(1300);
        System.out.println("equals(): " + (e1.equals(e2)));
        System.out.println("=: " + (e1 == e2));

        Component component = new Button();
        Graphics graphics = component.getGraphics();


        EngineFlyweightFactory factory
                = new EngineFlyweightFactory();

        Engine standard1 = factory.getStandardEngine(1300);
        standard1.drawDiagram(component, graphics);

        Engine standard2 = factory.getStandardEngine(1300);
        standard2.drawDiagram(component, graphics);

        Engine standard3 = factory.getStandardEngine(1300);
        standard3.drawDiagram(component, graphics);

        Engine standard4 = factory.getStandardEngine(1600);
        standard4.drawDiagram(component, graphics);

        Engine standard5 = factory.getStandardEngine(1600);
        standard5.drawDiagram(component, graphics);

        System.out.println("standard1 == standard2 = " +
                (standard1 == standard2));
        System.out.println("standard2 == standard3 = " +
                (standard2 == standard3));
        System.out.println("standard3 == standard4 = " +
                (standard3 == standard4));
        System.out.println("standard4 == standard5 = " +
                (standard4 == standard5));
    }

}
