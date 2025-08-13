package org.dp.bridge.v2;
/*
 * V2
 * 2种游戏，2种游戏机规格，一共4个实现类
 * 问题：100种游戏，5种游戏机规格，需要500种游戏机实现类！
 * */
public class Client {
    public static void main(String[] args){
        //1.Basic+俄罗斯方块
        GameMachine tetrisGameMachineBasic = new TetrisGameMachineBasic();
        tetrisGameMachineBasic.run();

        System.out.println("----------------------");

        //2.Basic+吃豆人
        GameMachine pacmanGameMachineBasic = new PacmanGameMachineBasic();
        pacmanGameMachineBasic.run();

        System.out.println("----------------------");

        //3.Pro+俄罗斯方块
        GameMachine tetrisGameMachinePro = new TetrisGameMachinePro();
        tetrisGameMachinePro.run();

        System.out.println("----------------------");

        //4.Pro+吃豆人
        GameMachine pacmanGameMachinePro = new PacmanGameMachinePro();
        pacmanGameMachinePro.run();
    }
}
