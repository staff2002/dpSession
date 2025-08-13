package org.dp.bridge.v3;

public abstract class GameMachine {
    protected GameCard gameCard;

    public void setGameCard(GameCard gameCard) {
        this.gameCard = gameCard;
    }

    public abstract void run();
}
