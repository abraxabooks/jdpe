package chapter27;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

public class SatNavView implements PropertyChangeListener {

    // The view needs a reference to the model
    private SatNavModel model;

    // The view uses a JFrame
    private JFrame viewingFrame;

    // UI controls to change direction and speed
    private JButton northButton, southButton, westButton, eastButton;
    private JSlider speedSlider;

    // UI feedback to show current direction and speed
    private String directionString, speedString;
    private JLabel feedbackLabel;


    public SatNavView(SatNavModel model) {
        this.model = model;
        
        // The view listens for changes to the model
        this.model.addPropertyChangeListener(this);

        // Initialise the UI
        this.viewingFrame = new JFrame("Satellite Navigation");
        this.viewingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.northButton = new JButton("North");
        this.disableNorthButton(); // Default direction

        this.southButton = new JButton("South");
        this.westButton = new JButton("West");
        this.eastButton = new JButton("East");

        this.speedSlider = new JSlider(JSlider.VERTICAL, 0, 30, 0);
        this.speedSlider.setMajorTickSpacing(10);
        this.speedSlider.setMinorTickSpacing(1);
        this.speedSlider.setPaintTicks(true);
        this.speedSlider.setPaintLabels(true);

        this.directionString = "You are pointing " +
                                this.model.getDirection();
        this.speedString = "but not yet moving. Use buttons & slider.";
        this.feedbackLabel = new JLabel(this.directionString +
                                        ", " +
                                        this.speedString);

        // Layout the direction buttons
        JPanel directionPanel = new JPanel(new GridLayout(3, 3));
        directionPanel.setBorder(new TitledBorder("Direction"));
        directionPanel.add(new JLabel(""));
        directionPanel.add(northButton);
        directionPanel.add(new JLabel(""));
        directionPanel.add(westButton);
        directionPanel.add(new JLabel(""));
        directionPanel.add(eastButton);
        directionPanel.add(new JLabel(""));
        directionPanel.add(southButton);
        directionPanel.add(new JLabel(""));

        // Layout the slider
        JPanel speedPanel = new JPanel();
        speedPanel.setBorder(new TitledBorder("Speed"));
        speedPanel.add(this.speedSlider);

        // Layout the feedback
        JPanel feedbackPanel = new JPanel();
        feedbackPanel.setBorder(new TitledBorder("Feedback"));
        feedbackPanel.add(feedbackLabel);

        // Position the panels onto the frame
        JPanel framePanel = new JPanel(new BorderLayout());
        framePanel.add(directionPanel, BorderLayout.LINE_START);
        framePanel.add(speedPanel, BorderLayout.LINE_END);
        framePanel.add(feedbackPanel, BorderLayout.PAGE_END);

        this.viewingFrame.getContentPane().add(framePanel);
    }

    public void show() {
        // Show the view sized and centered
        this.viewingFrame.pack();
        this.viewingFrame.setLocationRelativeTo(null);
        this.viewingFrame.setVisible(true);
    }

    // The controller will register as a listener using these methods
    public void addNorthButtonListener(ActionListener al) {
        this.northButton.addActionListener(al);
    }

    public void addSouthButtonListener(ActionListener al) {
        this.southButton.addActionListener(al);
    }

    public void addWestButtonListener(ActionListener al) {
        this.westButton.addActionListener(al);
    }

    public void addEastButtonListener(ActionListener al) {
        this.eastButton.addActionListener(al);
    }

    public void addSliderListener(ChangeListener cl) {
        this.speedSlider.addChangeListener(cl);
    }

    // The controller will call these methods to enable UI controls
    public void enableNorthButton() {
        this.northButton.setEnabled(true);
    }

    public void disableNorthButton() {
        this.northButton.setEnabled(false);
    }

    public void enableSouthButton() {
        this.southButton.setEnabled(true);
    }

    public void disableSouthButton() {
        this.southButton.setEnabled(false);
    }

    public void enableWestButton() {
        this.westButton.setEnabled(true);
    }

    public void disableWestButton() {
        this.westButton.setEnabled(false);
    }

    public void enableEastButton() {
        this.eastButton.setEnabled(true);
    }

    public void disableEastButton() {
        this.eastButton.setEnabled(false);
    }

    // Called by the model when it changes
    public void propertyChange(PropertyChangeEvent pce) {
        if (this.model.getSpeed() == 0) {
            this.directionString = "You are pointing " +
                              this.model.getDirection();
            this.speedString = "but are not currently moving.";

        } else if (pce.getPropertyName().equals(SatNavModel.DIRECTION_CHANGE)) {
            SatNavModel.Direction newDirection =
                    (SatNavModel.Direction) pce.getNewValue();
            this.directionString = "Now travelling " + newDirection;
            this.speedString = "travelling at " + this.model.getSpeed();

        } else if (pce.getPropertyName().equals(SatNavModel.SPEED_CHANGE)) {
            int oldSpeed = (Integer) pce.getOldValue();
            int newSpeed = (Integer) pce.getNewValue();
            if (oldSpeed < newSpeed) {
                this.speedString = "and you have sped up to " +
                                    this.model.getSpeed();

            } else {
                this.speedString = "and you have slowed down to " +
                                    this.model.getSpeed();
            }
        }

        this.feedbackLabel.setText(this.directionString +
                                   ", " +
                                   this.speedString);
    }

}
