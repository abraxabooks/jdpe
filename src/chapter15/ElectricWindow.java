package chapter15;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class ElectricWindow {
    
    private boolean open;

    public ElectricWindow() {
        this.open = false;
        System.out.println("Window is closed");
    }

    public boolean isOpen() {
        return this.open;
    }
    
    public boolean isClosed() {
        return (! this.open);
    }

    public void openWindow() {
        if (this.isClosed()) {
            this.open = true;
            System.out.println("Window is now open");
        }
    }

    public void closeWindow() {
        if (this.isOpen()) {
            this.open = false;
            System.out.println("Window is now closed");
        }
    }

}
