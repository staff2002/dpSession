package org.dp.factorymethod.v1;

import java.util.List;
/*
 * V1 增加IRecommenderFactory
 * ProductRecommenderV1 和 具体的Factory解藕，依赖Factory接口，符合依赖倒置
 * */
public class ProductRecommenderV1 {
    private IRecommenderFactory recommenderFactory = new RecommenderFactory();

    public List<String> recommend(String category) throws Exception {
        Recommender recommender = recommenderFactory.createRecommender(category);
        return recommender.recommend();
    }
}
