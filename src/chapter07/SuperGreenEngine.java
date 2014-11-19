package chapter07;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class SuperGreenEngine {

    private int size;
    private boolean turbo;

    public SuperGreenEngine() {
        this.size = 1100;
        this.turbo = false;
    }

    public int getEngineSize() {
        return this.size;
    }

    public boolean isEngineTurbo() {
        return this.turbo;
    }

    public String toString() {
        return (this.getClass().getSimpleName());
    }

}
