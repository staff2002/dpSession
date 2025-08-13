package org.dp.templatemethod.v1;

public class MtCarDriver implements Driver{
    @Override
    public void startCar(){
        System.out.println("踩刹车");
        System.out.println("踩离合");
        System.out.println("插入钥匙");
        System.out.println("转动钥匙打火");
        System.out.println("放开手刹");
        System.out.println("松刹车");
        System.out.println("抬起离合");
        System.out.println("踩油门");
    }
}
