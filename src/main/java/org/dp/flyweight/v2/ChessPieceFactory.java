package org.dp.flyweight.v2;

import java.util.Hashtable;
import java.util.Map;
/*
* 增加棋子工厂，用于获取棋子实例
* 通过对象池维护有限数量的对象实例
* 对象池中不存在的 pattern 棋子对象实例，才会创建，并放入池中
* 如存在该 pattern 棋子对象实例，直接从池中获取并返回
* */
public class ChessPieceFactory {
    private static final Map<String, ChessPiece> chessPiecePool = new Hashtable<>();

    public ChessPiece getChessPiece(String pattern) {
        if (!chessPiecePool.containsKey(pattern)) {
            chessPiecePool.put(pattern, new ChessPiece(pattern));
        }
        return chessPiecePool.get(pattern);
    }
}
