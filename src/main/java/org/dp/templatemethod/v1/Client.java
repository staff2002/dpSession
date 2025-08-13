package org.dp.templatemethod.v1;
/*
* V1 不使用设计模式
* Driver 接口有自动挡和手动挡两个实现
* 问题：两个Driver实现 startCar() 的流程基本一直，仅细节不同。算法骨架无法复用，缺少算法骨架的抽象。
* */
public class Client {
    public static void main(String[] args) {
        Driver atCarDriver = new MtCarDriver();
        atCarDriver.startCar();
    }
}
