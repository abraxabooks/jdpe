package chapter27;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SatNavController {

    // Need a reference to both the model and the view
    private SatNavModel model;
    private SatNavView view;


    public SatNavController(SatNavModel model, SatNavView view) {
        this.model = model;
        this.view = view;

        // The controller needs to listen to the view
        this.view.addNorthButtonListener(new NorthButtonListener());
        this.view.addSouthButtonListener(new SouthButtonListener());
        this.view.addWestButtonListener(new WestButtonListener());
        this.view.addEastButtonListener(new EastButtonListener());
        this.view.addSliderListener(new SliderListener());
    }


    // Inner classes which server as view listeners
    private class NorthButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            view.disableNorthButton();
            view.enableSouthButton();
            view.enableWestButton();
            view.enableEastButton();
            model.setDirection(SatNavModel.Direction.NORTH);
        }
    }

    private class SouthButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            view.enableNorthButton();
            view.disableSouthButton();
            view.enableWestButton();
            view.enableEastButton();
            model.setDirection(SatNavModel.Direction.SOUTH);
        }
    }

    private class WestButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            view.enableNorthButton();
            view.enableSouthButton();
            view.disableWestButton();
            view.enableEastButton();
            model.setDirection(SatNavModel.Direction.WEST);
        }
    }

    private class EastButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            view.enableNorthButton();
            view.enableSouthButton();
            view.enableWestButton();
            view.disableEastButton();
            model.setDirection(SatNavModel.Direction.EAST);
        }
    }

    private class SliderListener implements ChangeListener {
        public void stateChanged(ChangeEvent ce) {
            JSlider slider = (JSlider) ce.getSource();
            model.setSpeed(slider.getValue());
        }
    }

}
