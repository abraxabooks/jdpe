package chapter06;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class SerialNumberGenerator {

    private int serial;

    // Constructor is private...
    private SerialNumberGenerator() {
        this.serial = 0;
    }

    /* This private static inner class instantiates the single
     * instance lazily, i.e only the first time INSTANCE is
     * accessed.
     */
    private static final class Holder {
        private static final SerialNumberGenerator INSTANCE
                = new SerialNumberGenerator();
    }

    /**
     * Returns the single instance of this class.
     * This method is thread-safe without any synchronization needed.
     */
    public static SerialNumberGenerator getInstance() {
        return SerialNumberGenerator.Holder.INSTANCE;
    }

    public int getNextSerial() {
        return ++this.serial;
    }

}
