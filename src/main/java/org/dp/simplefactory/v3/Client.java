package org.dp.simplefactory.v3;

import org.dp.simplefactory.v2.ProductRecommenderV2;

import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception {
        ProductRecommenderV3 productRecommender = new ProductRecommenderV3();
        List<String> products = productRecommender.recommend("TV");
        products.forEach(System.out::println);
    }
}