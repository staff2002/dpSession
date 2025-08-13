package org.dp.templatemethod.v2;

public class MtCarDriver extends Driver {

    @Override
    protected void prepareToStart() {
        System.out.println("踩刹车");
        System.out.println("踩离合");
    }

    @Override
    protected void startEngine() {
        System.out.println("插入钥匙");
        System.out.println("转动钥匙打火");
    }

    @Override
    protected void gear() {
        System.out.println("挂1档");
    }

    @Override
    protected void releaseHandbrake() {
        System.out.println("放开手刹");
    }

    @Override
    protected void stepOnGas() {
        System.out.println("松刹车");
        System.out.println("抬起离合");
        System.out.println("踩油门");
    }
}
