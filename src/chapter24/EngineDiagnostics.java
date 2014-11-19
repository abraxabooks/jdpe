package chapter24;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class EngineDiagnostics implements EngineVisitor {

    public void visit(Camshaft p) {
        System.out.println("Diagnosing the camshaft");
    }

    public void visit(Engine e) {
        System.out.println("Diagnosing the unit engine");
    }

    public void visit(Piston p) {
        System.out.println("Diagnosing the piston");
    }

    public void visit(SparkPlug sp) {
        System.out.println("Diagnosing a single spark plug");
    }

}
