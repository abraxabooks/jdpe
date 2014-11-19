package chapter06;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class Client {
    
    private int serialNumber;

    public static void main(String[] args) {
        Client c = new Client();
        c.test();
    }

    public Client() {
        this.serialNumber = 0;
    }

    public void setSerialNumber(int serial) {
        this.serialNumber = serial;
        System.out.println("serial " + serial);
    }

    private void test() {
        SerialNumberGenerator generator
                = SerialNumberGenerator.getInstance();
        this.setSerialNumber(generator.getNextSerial());
        this.setSerialNumber(generator.getNextSerial());
        this.setSerialNumber(generator.getNextSerial());
    }

}
