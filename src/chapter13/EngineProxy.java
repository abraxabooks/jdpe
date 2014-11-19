package chapter13;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import java.awt.*;

public class EngineProxy implements Engine {
    
    private Engine engine;

    private Thread t;
    private boolean drawingInProgress = false;
    private Component finishedDrawing;

    public EngineProxy(int size, boolean turbo) {
        if (turbo) {
            this.engine = new TurboEngine(size);

        } else {
            this.engine = new StandardEngine(size);
        }
    }

    public int getSize() {
        return this.engine.getSize();
    }

    public boolean isTurbo() {
        return this.engine.isTurbo();
    }

    // We will assume this method is time-consuming...
    public void drawDiagram(final Component c, Graphics g) {
        if (this.finishedDrawing != null) {
            this.engine.drawDiagram(this.finishedDrawing, g);

        } else {
            g.drawString("Please wait for image to load...", 0, 0);

            if (! this.drawingInProgress) {
                t = new Thread(new Runnable() {
                    public void run() {
                        try {
                            // ... real code omitted ...
                            t.wait(5000);
                            c.repaint();
                        } catch (InterruptedException ex) {
                            // ... omitted ...
                        }
                    }
                });
                t.start();
            }
        }
    }

}
