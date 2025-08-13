package org.dp.flyweight.v2;

/*
 * v2 棋子对象中仅维护图案属性，剥离掉可变的坐标位置属性
 * draw方法通过外部传参，实现绘制方法
 * */
public class ChessPiece implements IChessPiece {
    private final String pattern;

    public ChessPiece(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public void draw(int positionX, int positionY) {
        System.out.println("在棋盘坐标(" + positionX + "," + positionY + ")位置，绘制" + pattern + "图案棋子");
    }
}
