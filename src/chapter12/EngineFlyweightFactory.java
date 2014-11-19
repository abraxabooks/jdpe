package chapter12;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import java.util.*;

public class EngineFlyweightFactory {
    
    private Map<Integer, Engine> standardEnginePool;
    private Map<Integer, Engine> turboEnginePool;

    public EngineFlyweightFactory() {
        this.standardEnginePool = new HashMap<Integer, Engine>();
        this.turboEnginePool = new HashMap<Integer, Engine>();
    }

    public Engine getStandardEngine(int size) {
        Engine e = this.standardEnginePool.get(size);
        if (e == null) {
            e = new StandardEngine(size);
            this.standardEnginePool.put(size, e);
        }
        return e;
    }

    public Engine getTurboEngine(int size) {
        Engine e = this.turboEnginePool.get(size);
        if (e == null) {
            e = new TurboEngine(size);
            this.turboEnginePool.put(size, e);
        }
        return e;
    }

}
