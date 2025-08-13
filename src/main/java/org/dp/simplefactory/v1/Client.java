package org.dp.simplefactory.v1;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        ProductRecommenderV1 productRecommender = new ProductRecommenderV1();
        List<String> products = productRecommender.recommend("notebook");
        products.forEach(System.out::println);
    }
}