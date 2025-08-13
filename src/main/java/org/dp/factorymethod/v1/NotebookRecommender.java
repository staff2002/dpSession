package org.dp.factorymethod.v1;

import java.util.ArrayList;
import java.util.List;

public class NotebookRecommender implements Recommender {
    @Override
    public List<String> recommend() {
        List<String> products = new ArrayList<>();
        products.add("Lenovo R7000P");
        products.add("hp 9victus");
        products.add("dell g16");
        return products;
    }
}
