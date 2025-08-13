package org.dp.simplefactory.v1;

import java.util.ArrayList;
import java.util.List;

public class ProductRecommenderV1 {
    public List<String> recommend(String category) {
        List<String> products = new ArrayList<>();
        switch (category) {
            case "phone" -> {
                products.add("huawei mate 60");
                products.add("iphone 14");
                products.add("xiaomi 15");
            }
            case "TV" -> {
                products.add("TCL T85");
                products.add("sony X75");
                products.add("samsung QA55");
            }
            case "notebook" -> {
                products.add("Lenovo R7000P");
                products.add("hp 9victus");
                products.add("dell g16");
            }
            case null, default -> {
                products.add("huawei mate 60");
                products.add("TCL T85");
                products.add("dell g16");
            }
        }
        return products;
    }
}