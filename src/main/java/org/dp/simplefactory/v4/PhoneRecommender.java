package org.dp.simplefactory.v4;

import java.util.ArrayList;
import java.util.List;

public class PhoneRecommender implements Recommender{
    @Override
    public List<String> recommend() {
        List<String> products = new ArrayList<>();
        products.add("huawei mate 60");
        products.add("iphone 14");
        products.add("xiaomi 15");
        return products;
    }
}
