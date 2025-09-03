package org.dp.simplefactory.v3;

import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception{
        ProductRecommenderV3 productRecommender = new ProductRecommenderV3();
        List<String> products = null;
        products = productRecommender.recommend("television");
        products.forEach(System.out::println);
    }
}