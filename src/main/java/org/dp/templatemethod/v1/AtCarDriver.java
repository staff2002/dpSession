package org.dp.templatemethod.v1;

public class AtCarDriver implements Driver{
    @Override
    public void startCar(){
        System.out.println("踩刹车");
        System.out.println("一键启动");
        System.out.println("挂D档");
        System.out.println("放开电子手刹");
        System.out.println("松刹车");
        System.out.println("踩油门");
    }
}
