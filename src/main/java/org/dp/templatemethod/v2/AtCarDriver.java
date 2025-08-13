package org.dp.templatemethod.v2;

public class AtCarDriver extends Driver {

    @Override
    protected void prepareToStart() {
        System.out.println("踩刹车");
    }

    @Override
    protected void startEngine() {
        System.out.println("一键启动");
    }

    @Override
    protected void gear() {
        System.out.println("挂D档");
    }

    @Override
    protected void releaseHandbrake() {
        System.out.println("放开电子手刹");
    }

    @Override
    protected void stepOnGas() {
        System.out.println("松刹车");
        System.out.println("踩油门");
    }
}
