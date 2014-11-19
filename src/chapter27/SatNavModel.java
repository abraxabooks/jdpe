package chapter27;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import java.io.*;
import java.beans.*;

public class SatNavModel implements Serializable {

    // Used when notifying listeners so they know what has changed
    public static final String DIRECTION_CHANGE = "direction";
    public static final String SPEED_CHANGE = "speed";

    // The directions we can travel
    public enum Direction {NORTH, SOUTH, EAST, WEST};

    // The current direction and speed
    private Direction currentDirection;
    private int currentSpeed;

    // This class is observable
    private PropertyChangeSupport changeSupport;


    public SatNavModel() {
        this.currentDirection = Direction.NORTH;
        this.currentSpeed = 0;
        this.changeSupport = new PropertyChangeSupport(this);
    }

    public void setDirection(Direction newDirection) {
        if (! newDirection.equals(this.currentDirection)) {
            Direction previousDirection = this.currentDirection;
            this.currentDirection = newDirection;
            this.changeSupport.firePropertyChange
                                        (DIRECTION_CHANGE,
                                         previousDirection,
                                         this.currentDirection);

        }
    }

    public Direction getDirection() {
        return this.currentDirection;
    }

    public void setSpeed(int newSpeed) {
        if (newSpeed != this.currentSpeed) {
            int previousSpeed = this.currentSpeed;
            this.currentSpeed = newSpeed;
            this.changeSupport.firePropertyChange
                                        (SPEED_CHANGE,
                                         previousSpeed,
                                         this.currentSpeed);

        }
    }

    public int getSpeed() {
        return this.currentSpeed;
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        this.changeSupport.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        this.changeSupport.removePropertyChangeListener(pcl);
    }

}
