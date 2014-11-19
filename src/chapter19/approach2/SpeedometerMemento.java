package chapter19.approach2;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import java.io.*;

public class SpeedometerMemento {

    public SpeedometerMemento(Speedometer speedometer) throws IOException {
        // Serialize...
        File speedometerFile = new File("speedometer.ser");
        ObjectOutputStream oos = null;
        oos = new ObjectOutputStream(
                new BufferedOutputStream(
                    new FileOutputStream(speedometerFile)));
        oos.writeObject(speedometer);
        oos.close();
    }

    public Speedometer restoreState() throws IOException,
                                             ClassNotFoundException {
        // Deserialize...
        File speedometerFile = new File("speedometer.ser");
        ObjectInputStream ois = null;
        ois = new ObjectInputStream(
                new BufferedInputStream(
                    new FileInputStream(speedometerFile)));
        Speedometer speedo = (Speedometer) ois.readObject();
        ois.close();
        return speedo;
    }

}
