package org.dp.flyweight.v2;

import java.util.Random;

public class Chessboard {
    private final ChessPiece[][] ChessPiece = new ChessPiece[5][5];

    public void initChessboard() {
        //可以使用的棋子图案
        String[] patterns = {"熊小猫", "兔小白", "汪小黄"};
        ChessPieceFactory chessPieceFactory = new ChessPieceFactory();
        //初始化棋盘上的棋子，随机一种棋子图案。
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Random random = new Random();
                String randomChessPattern = patterns[random.nextInt(3)];
                //从棋子工厂获取棋子实例
                ChessPiece[i][j] =
                        chessPieceFactory.getChessPiece(randomChessPattern);
            }
        }
    }

    public void draw() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                ChessPiece chessPiece = ChessPiece[i][j];
                if (chessPiece != null) {
                    //位置信息作为方法参数从外部传递给棋子对象
                    chessPiece.draw(i, j);
                }
            }
        }
    }
}
