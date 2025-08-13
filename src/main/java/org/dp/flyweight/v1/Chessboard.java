package org.dp.flyweight.v1;

import java.util.Random;

public class Chessboard {
    //使用二维数组维护棋盘上棋子的状态
    private final IChessPiece[][] ChessPieces = new ChessPiece[5][5];

    public void initChessboard() {
        //可以使用的棋子图案
        String[] patterns = {"熊小猫", "兔小白", "汪小黄"};
        //初始化棋盘上的棋子，随机一种棋子图案。
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Random random = new Random();
                String randomChessPattern = patterns[random.nextInt(3)];
                //每次都会创建新的棋子实例
                ChessPieces[i][j] = new ChessPiece(randomChessPattern, i, j);
            }
        }
    }

    public void draw() {
        System.out.println("绘制棋盘");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                IChessPiece chessPiece = ChessPieces[i][j];
                if (chessPiece != null) {
                    chessPiece.draw();
                }
            }
        }
    }
}
