package chapter13;

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
        Component component = new Panel();
        Graphics graphics = component.getGraphics();

        Engine e = new EngineProxy(1300, true);
        System.out.println(e.getSize());
        System.out.println(e.isTurbo());

        e.drawDiagram(component, graphics);
    }

}
