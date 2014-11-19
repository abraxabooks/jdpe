package chapter07;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import chapter01.*;
import java.util.*;

public class Client {

    public static void main(String[] args) {
        List<Engine> engines = new ArrayList<Engine>();
        engines.add(new StandardEngine(1300));
        engines.add(new StandardEngine(1600));
        engines.add(new TurboEngine(2000));

        SuperGreenEngine superEngine = new SuperGreenEngine();
        engines.add(new SuperGreenEngineAdapter(superEngine));

        for (Engine eachEngine : engines) {
            System.out.println
                    ("size=" + eachEngine.getSize() +
                     ", turbo=" + eachEngine.isTurbo());
        }
    }

}
