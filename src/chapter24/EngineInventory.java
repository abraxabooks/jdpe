package chapter24;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class EngineInventory implements EngineVisitor {

    private int camshaftCount;
    private int pistonCount;
    private int sparkPlugCount;

    public EngineInventory() {
        this.camshaftCount = 0;
        this.pistonCount = 0;
        this.sparkPlugCount = 0;
    }

    public void visit(Camshaft p) {
        this.camshaftCount++;
    }

    public void visit(Engine e) {
        System.out.println("The engine has: " +
                            this.camshaftCount + " camshaft(s), " +
                            this.pistonCount + " piston(s), and " +
                            this.sparkPlugCount + " spark plug(s)");
    }

    public void visit(Piston p) {
        this.pistonCount++;
    }

    public void visit(SparkPlug sp) {
        this.sparkPlugCount++;
    }

}
