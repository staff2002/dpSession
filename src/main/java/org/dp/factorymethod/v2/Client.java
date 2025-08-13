package org.dp.factorymethod.v2;

import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception {
        ProductRecommenderV2 productRecommender = new ProductRecommenderV2();
        List<String> phones = productRecommender.recommend("notebook");
        phones.forEach(System.out::println);
    }
}