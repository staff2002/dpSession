package org.dp.bridge.v3;

/*
 * V2
 * 2种游戏，2种游戏机规格，一共4个实现类
 * 问题：100种游戏，5种游戏机规格，需要500种游戏机实现类！
 * */
public class Client {
    public static void main(String[] args) {
        //1.Basic+俄罗斯方块
        GameMachine gameMachineBasic = new GameMachineBasic();
        gameMachineBasic.setGameCard(new TetrisGameCard());
        gameMachineBasic.run();

        System.out.println("----------------------");

        //2.Basic+吃豆人
        gameMachineBasic.setGameCard(new PacmanGameCard());
        gameMachineBasic.run();

        System.out.println("----------------------");

        //3.Pro+俄罗斯方块
        GameMachine gameMachinePro = new GameMachinePro();
        gameMachinePro.setGameCard(new TetrisGameCard());
        gameMachinePro.run();

        System.out.println("----------------------");

        //4.Pro+吃豆人
        gameMachinePro.setGameCard(new PacmanGameCard());
        gameMachinePro.run();


    }
}
