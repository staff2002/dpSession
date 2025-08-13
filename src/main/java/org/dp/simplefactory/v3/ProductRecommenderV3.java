package org.dp.simplefactory.v3;

import java.util.List;

public class ProductRecommenderV3 {
    private PhoneRecommender phoneRecommender = new PhoneRecommender();
    private TelevisionRecommender televisionRecommender = new TelevisionRecommender();
    private NotebookRecommender notebookRecommender = new NotebookRecommender();

    public List<String> recommend(String category) throws Exception {
        if ("phone".equals(category)) {
            return phoneRecommender.recommend();
        } else if ("television".equals(category)) {
            return televisionRecommender.recommend();
        } else if ("notebook".equals(category)) {
            return notebookRecommender.recommend();
        } else {
            throw new Exception();
        }
    }
}
