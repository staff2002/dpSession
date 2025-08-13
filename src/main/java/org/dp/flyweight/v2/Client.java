package org.dp.flyweight.v2;


public class Client {
    public static void main(String[] args) {
        Chessboard chessboard = new Chessboard();
        chessboard.initChessboard();
        chessboard.draw();
    }
}
