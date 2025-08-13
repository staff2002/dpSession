package org.dp.factorymethod.v3;

import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception {
        ProductRecommenderV3 productRecommender = new ProductRecommenderV3();
        List<String> phones = productRecommender.recommend("phone");
        phones.forEach(System.out::println);
    }
}