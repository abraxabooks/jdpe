package chapter25;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class Client {

    public static void main(String[] args) {
        Client.with();
    }

    private static void without() {
        // Without null-object...
        WarningLight[] lights = new WarningLight[3];
        lights[0] = new OilLevelLight();
        lights[1] = new BrakeFluidLight();
        lights[2] = null;

        for (WarningLight currentLight : lights) {
            if (currentLight != null) {
                currentLight.on();
                currentLight.off();
            }
        }
    }

    private static void with() {
        // With null-object...
        WarningLight[] lights = new WarningLight[3];
        lights[0] = new OilLevelLight();
        lights[1] = new BrakeFluidLight();
        lights[2] = new NullObjectLight();

        for (WarningLight currentLight : lights) {
            currentLight.on();
            currentLight.off();
        }
    }

}
