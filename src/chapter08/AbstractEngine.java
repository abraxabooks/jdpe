package chapter08;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public abstract class AbstractEngine implements Engine {

    private int size;
    private boolean turbo;
    private boolean running;
    private int power;

    public AbstractEngine(int size, boolean turbo) {
        this.size = size;
        this.turbo = turbo;
        this.running = false;
        this.power = 0;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isTurbo() {
        return this.turbo;
    }
    
    public void start() {
        this.running = true;
    }

    public void stop() {
        this.running = false;
        this.power = 0;
    }

    public void increasePower() {
        if (this.power < 10) {
            this.power++;
        }
    }

    public void decreasePower() {
        if (this.power > 0) {
            this.power--;
        }
    }

    public String toString() {
        return (this.getClass().getSimpleName() +
                "[" +
                "size=" + this.getSize() +
                ", turbo=" + this.isTurbo() +
                "]");
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (! (other instanceof Engine)) return false;
        Engine otherEngine = (Engine) other;
        return (this.toString().equals(otherEngine.toString()));
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

}
