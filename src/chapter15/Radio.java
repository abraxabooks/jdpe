package chapter15;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class Radio {

    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 10;
    public static final int DEFAULT_VOLUME = 5;
    
    private boolean on;
    private int volume;
    
    public Radio() {
        this.on = false;
        this.volume = Radio.DEFAULT_VOLUME;
    }
    
    public boolean isOn() {
        return this.on;
    }
    
    public int getVolume() {
        return this.volume;
    }

    public void on() {
        this.on = true;
        System.out.println("Radio now on, volume level " +
                            this.getVolume());
    }

    public void off() {
        this.on = false;
        System.out.println("Radio now off");
    }

    public void volumeUp() {
        if (this.isOn()) {
            if (this.getVolume() < Radio.MAX_VOLUME) {
                this.volume++;
                System.out.println("Volume turned up to level " +
                                    this.getVolume());
            }
        }
    }

    public void volumeDown() {
        if (this.isOn()) {
            if (this.getVolume() > Radio.MIN_VOLUME) {
                this.volume--;
                System.out.println("Volume turned down to level " +
                                    this.getVolume());
            }
        }
    }

}
