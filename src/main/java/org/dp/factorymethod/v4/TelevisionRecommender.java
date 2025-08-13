package org.dp.factorymethod.v4;

import java.util.ArrayList;
import java.util.List;

public class TelevisionRecommender extends Recommender {
    public TelevisionRecommender(String RecommendEngine) {
        super(RecommendEngine);
    }

    @Override
    public List<String> recommend() {
        System.out.println("推荐结果来自"+recommendEngine);
        List<String> products = new ArrayList<>();
        products.add("TCL T85");
        products.add("sony X75");
        products.add("samsung QA55");
        return products;
    }
}
