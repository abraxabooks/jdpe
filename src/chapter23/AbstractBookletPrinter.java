package chapter23;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public abstract class AbstractBookletPrinter {

    protected abstract int getPageCount();
    protected abstract void printFrontCover();
    protected abstract void printTableOfContents();
    protected abstract void printPage(int pageNumber);
    protected abstract void printIndex();
    protected abstract void printBackCover();

    // This is the 'template method'
    public final void print() {
        this.printFrontCover();
        this.printTableOfContents();
        for (int i = 1; i <= this.getPageCount(); i++) {
            this.printPage(i);
        }
        this.printIndex();
        this.printBackCover();
    }

}
