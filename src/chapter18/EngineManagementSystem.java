package chapter18;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class EngineManagementSystem {

    private Ignition ignition;
    private Gearbox gearbox;
    private Accelerator accelerator;
    private Brake brake;
    
    private int currentSpeed;
    
    public EngineManagementSystem() {
        this.currentSpeed = 0;
    }

    public void registerIgnition(Ignition ignition) {
        this.ignition = ignition;
    }

    public void registerGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public void registerAccelerator(Accelerator accelerator) {
        this.accelerator = accelerator;
    }

    public void registerBrake(Brake brake) {
        this.brake = brake;
    }

    public void ignitionTurnedOn() {
        this.gearbox.enable();
        this.accelerator.enable();
        this.brake.enable();
    }

    public void ignitionTurnedOff() {
        this.gearbox.disable();
        this.accelerator.disable();
        this.brake.disable();
    }

    public void gearboxEnabled() {
        System.out.println("EMS now controlling the gearbox");
    }

    public void gearboxDisabled() {
        System.out.println("EMS no longer controlling the gearbox");
    }

    public void gearChanged() {
        System.out.println("EMS disengaging revs while gear changing");
    }

    public void acceleratorEnabled() {
        System.out.println("EMS now controlling the accelerator");
    }

    public void acceleratorDisabled() {
        System.out.println("EMS no longer controlling the accelerator");
    }

    public void acceleratorPressed() {
        this.brake.disable();
        while (this.currentSpeed < this.accelerator.getSpeed()) {

            this.currentSpeed += 1;

            if ((this.currentSpeed > 0) && (this.currentSpeed <= 10)) {
                System.out.println("Speed currently " + this.currentSpeed);
                this.gearbox.setGear(Gearbox.Gear.FIRST);

            } else if ((this.currentSpeed > 10) && (this.currentSpeed <= 20)) {
                System.out.println("Speed currently " + this.currentSpeed);
                this.gearbox.setGear(Gearbox.Gear.SECOND);

            } else if ((this.currentSpeed > 20) && (this.currentSpeed <= 30)) {
                System.out.println("Speed currently " + this.currentSpeed);
                this.gearbox.setGear(Gearbox.Gear.THIRD);

            } else if ((this.currentSpeed > 30) && (this.currentSpeed <= 40)) {
                System.out.println("Speed currently " + this.currentSpeed);
                this.gearbox.setGear(Gearbox.Gear.FOURTH);

            } else if (this.currentSpeed > 40) {
                System.out.println("Speed currently " + this.currentSpeed);
                this.gearbox.setGear(Gearbox.Gear.FIFTH);
            }
        }
        this.brake.enable();
   }

    public void brakeEnabled() {
        System.out.println("EMS now controlling the brakes");
    }

    public void brakeDisabled() {
        System.out.println("EMS no longer controlling the brakes");
    }

    public void brakePressed() {
        this.accelerator.disable();
        this.currentSpeed = 0;
    }

    public void brakeReleased() {
        this.gearbox.setGear(Gearbox.Gear.FIRST);
        this.accelerator.enable();
    }

}
