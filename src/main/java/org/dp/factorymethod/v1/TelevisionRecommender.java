package org.dp.factorymethod.v1;

import java.util.ArrayList;
import java.util.List;

public class TelevisionRecommender implements Recommender {
    @Override
    public List<String> recommend() {
        List<String> products = new ArrayList<>();
        products.add("TCL T85");
        products.add("sony X75");
        products.add("samsung QA55");
        return products;
    }
}
