package org.dp.templatemethod.v2;
/*
 * V2 使用模版方法模式
 * Driver 改为抽象类，定义startCar()的算法骨架
 * 算法骨架中每个步骤的具体实现交给子类
 * 问题：两个Driver实现 startCar() 的流程基本一直，仅细节不同。算法骨架无法复用，缺少算法骨架的抽象。
 * */
public class Client {
    public static void main(String[] args) {
        System.out.println("----------以下为自动挡起步----------");
        Driver atCarDriver = new AtCarDriver();
        atCarDriver.startCar();

        System.out.println("----------以下为手动挡起步----------");
        Driver mtCarDriver = new MtCarDriver();
        mtCarDriver.startCar();
    }
}
