package org.dp.flyweight.v1;

public class Client {
    public static void main(String[] args) {
        Chessboard chessboard = new Chessboard();
        chessboard.initChessboard();
        chessboard.draw();
    }
}
