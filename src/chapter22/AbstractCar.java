package chapter22;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public abstract class AbstractCar extends AbstractVehicle {

    private GearboxStrategy gearboxStrategy;

    public AbstractCar(Engine engine) {
        super(engine);

        //  Starts in standard gearbox mode (more economical)
        this.gearboxStrategy = new StandardGearboxStrategy();
    }

    // Allow the gearbox strategy to be changed...
    public void setGearboxStrategy(GearboxStrategy gs) {
        this.gearboxStrategy = gs;
    }

    public GearboxStrategy getGearboxStrategy() {
        return this.getGearboxStrategy();
    }

    // Delegate to strategy in effect...
    public void setSpeed(int speed) {
        this.gearboxStrategy.ensureCorrectGear(this.getEngine(), speed);
    }
    
}
