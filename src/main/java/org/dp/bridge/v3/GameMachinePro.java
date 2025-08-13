package org.dp.bridge.v3;

public class GameMachinePro extends GameMachine {
    @Override
    public void run() {
        System.out.println("启动专业版游戏机");
        gameCard.run();
    }
}
