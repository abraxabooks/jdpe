package chapter15;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class WindowDownCommand implements Command {

    private ElectricWindow window;

    public WindowDownCommand(ElectricWindow w) {
        this.window = w;
    }

    public void execute() {
        this.window.openWindow();
    }

}
