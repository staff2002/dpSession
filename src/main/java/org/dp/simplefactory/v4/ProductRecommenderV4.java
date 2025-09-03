package org.dp.simplefactory.v4;

import java.util.List;
/*
符合依赖倒置、开闭、单一职责
 */
public class ProductRecommenderV4 {
    private RecommenderFactory recommenderFactory = new RecommenderFactory();

    public List<String> recommend(String category) throws Exception {
        Recommender recommender =
                recommenderFactory.createRecommender(category);
        return recommender.recommend();
    }
}
