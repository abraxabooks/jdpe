package chapter02;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public abstract class AbstractVehicleFactory {

    public abstract Body createBody();
    public abstract Chassis createChassis();
    public abstract Windows createWindows();
    
}
