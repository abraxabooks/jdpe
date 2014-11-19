package chapter01;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public interface Vehicle {

    public enum Colour {UNPAINTED, BLUE, BLACK, GREEN,
                        RED, SILVER, WHITE, YELLOW};

    public Engine getEngine();
    public void paint(Vehicle.Colour colour);
    public Vehicle.Colour getColour();

}
