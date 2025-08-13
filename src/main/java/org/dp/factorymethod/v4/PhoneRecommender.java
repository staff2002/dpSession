package org.dp.factorymethod.v4;

import java.util.ArrayList;
import java.util.List;

public class PhoneRecommender extends Recommender {
    public PhoneRecommender(String recommendEngine) {
        super(recommendEngine);
    }

    @Override
    public List<String> recommend() {
        System.out.println("推荐结果来自"+recommendEngine);
        List<String> products = new ArrayList<>();
        products.add("huawei mate 60");
        products.add("iphone 14");
        products.add("xiaomi 15");
        return products;
    }
}
