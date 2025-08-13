package org.dp.templatemethod.v2;

public abstract class Driver {
    public void startCar(){
        prepareToStart();
        startEngine();
        gear();
        releaseHandbrake();
        stepOnGas();
    }

    protected abstract void prepareToStart();
    protected abstract void startEngine();
    protected abstract void gear();
    protected abstract void releaseHandbrake();
    protected abstract void stepOnGas();
}
