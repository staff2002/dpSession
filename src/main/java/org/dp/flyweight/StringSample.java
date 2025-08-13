package org.dp.flyweight;
/*
* 字面量创建字符串对象时，会使用常量池，有直接返回，没有才创建。
* 通过new创建，会强制创建在堆内存
* */
public class StringSample {
    public static void main(String[] args) {
        String chessPieceRabbitA = "兔小白";
        String chessPieceRabbitB = "兔小白";
        System.out.println(chessPieceRabbitA == chessPieceRabbitB);

        String chessPieceRabbitC = new String("兔小白");
        String chessPieceRabbitD = new String("兔小白");
        System.out.println(chessPieceRabbitC == chessPieceRabbitD);
    }
}
