package org.dp.bridge.v3;

public class GameMachineBasic extends GameMachine {
    @Override
    public void run() {
        System.out.println("启动基础版游戏机");
        gameCard.run();
    }
}
