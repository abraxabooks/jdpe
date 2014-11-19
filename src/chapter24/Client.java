package chapter24;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class Client {

    public static void main(String[] args) {
        // Create an engine...
        Engine anEngine = new StandardEngine(1300);

        // Run diagnostics on the engine...
        anEngine.acceptEngineVisitor(new EngineDiagnostics());

        // Run inventory on the engine...
        anEngine.acceptEngineVisitor(new EngineInventory());
    }

}
