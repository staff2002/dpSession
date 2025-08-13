package org.dp.simplefactory.v2;

import java.util.ArrayList;
import java.util.List;

public class ProductRecommenderV2 {
    public List<String> recommend(String category) throws Exception {
        List<String> products = new ArrayList<>();
        switch (category) {
            case "phone" -> {
                recommendPhone(products);
            }
            case "TV" -> {
                recommendTV(products);
            }
            case "notebook" -> {
                recommendNoteBook(products);
            }
            case null, default -> {
                throw new Exception();
            }
        }
        return products;
    }

    private static void recommendNoteBook(List<String> products) {
        products.add("Lenovo R7000P");
        products.add("hp 9victus");
        products.add("dell g16");
    }

    private static void recommendTV(List<String> products) {
        products.add("TCL T85");
        products.add("sony X75");
        products.add("samsung QA55");
    }

    private static void recommendPhone(List<String> products) {
        products.add("huawei mate 60");
        products.add("iphone 14");
        products.add("xiaomi 15");
    }
}