package org.dp.flyweight.v1;

/*
* v1 棋子对象中维护了图案和所处位置信息
* 问题：游戏中需要多少棋子，就要创建多少棋子对象实例。本例中5*5的消消乐棋盘，创建25个实例
* */
public class ChessPiece implements IChessPiece {
    private final String pattern;
    private int positionX;
    private int positionY;

    public ChessPiece(String pattern, int positionX, int positionY) {
        this.pattern = pattern;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    @Override
    public void draw() {
        System.out.println("在棋盘坐标(" + positionX + "," + positionY + ")位置，绘制" + pattern + "图案棋子");
    }
}
