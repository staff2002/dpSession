package org.dp.simplefactory.v4;

import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception {
        ProductRecommenderV4 productRecommender = new ProductRecommenderV4();
        List<String> products = productRecommender.recommend("TV");
        products.forEach(System.out::println);
    }
}