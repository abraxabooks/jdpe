package chapter09;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
v
public class Client {

    public static void main(String[] args) {
        Item nut = new Part("Nut", 0.05);
        Item bolt = new Part("Bolt", 0.09);
        Item panel = new Part("Panel", 0.35);

        Item gizmo = new Assembly("Gizmo");
        gizmo.addItem(panel);
        gizmo.addItem(nut);
        gizmo.addItem(bolt);

        Item widget = new Assembly("Widget");
        widget.addItem(gizmo);
        widget.addItem(nut);

        System.out.println(nut);
        System.out.println(bolt);
        System.out.println(panel);
        System.out.println(gizmo);
        System.out.println(widget);
    }

}
