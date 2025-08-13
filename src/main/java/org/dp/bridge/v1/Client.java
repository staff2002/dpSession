package org.dp.bridge.v1;
/*
 * V1
 * 2种不同规格游戏机，通过2个不同类型的游戏机子类实现
 * */
public class Client {
    public static void main(String[] args){
        GameMachine gameMachineBasic = new TetrisGameMachineBasic();
        gameMachineBasic.run();

        GameMachine gameMachinePro = new TetrisGameMachinePro();
        gameMachinePro.run();
    }
}
