package chapter24;

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

    private Camshaft camshaft;
    private Piston piston;
    private SparkPlug[] sparkPlugs;

    public AbstractEngine(int size, boolean turbo) {
        this.size = size;
        this.turbo = turbo;

        // Create a camshaft, piston and 4 spark plugs...`
        this.camshaft = new Camshaft();
        this.piston = new Piston();
        this.sparkPlugs = new SparkPlug[]{new SparkPlug(),
                                          new SparkPlug(),
                                          new SparkPlug(),
                                          new SparkPlug()};
    }

    public int getSize() {
        return this.size;
    }

    public boolean isTurbo() {
        return this.turbo;
    }

    public void acceptEngineVisitor(EngineVisitor v) {
        // Visit each component first...
        this.camshaft.acceptEngineVisitor(v);
        this.piston.acceptEngineVisitor(v);
        for (SparkPlug eachSparkPlug : this.sparkPlugs) {
            eachSparkPlug.acceptEngineVisitor(v);
        }

        // Now visit the receiver...
        v.visit(this);
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
