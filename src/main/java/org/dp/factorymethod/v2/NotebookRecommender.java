package org.dp.factorymethod.v2;

import java.util.ArrayList;
import java.util.List;

public class NotebookRecommender extends Recommender {
    public NotebookRecommender(String RecommendEngine) {
        super(RecommendEngine);
    }

    @Override
    public List<String> recommend() {
        System.out.println("推荐结果来自"+recommendEngine);
        List<String> products = new ArrayList<>();
        products.add("Lenovo R7000P");
        products.add("hp 9victus");
        products.add("dell g16");
        return products;
    }
}
