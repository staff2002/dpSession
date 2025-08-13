package org.dp.simplefactory.v2;

import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception {
        ProductRecommenderV2 productRecommender = new ProductRecommenderV2();
        List<String> products = productRecommender.recommend("TV");
        products.forEach(System.out::println);
    }
}