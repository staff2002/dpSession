package org.dp.factorymethod.v4;

import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception {
        ProductRecommenderV4 productRecommender = new ProductRecommenderV4();
        List<String> phones = productRecommender.recommend("notebook");
        phones.forEach(System.out::println);
    }
}