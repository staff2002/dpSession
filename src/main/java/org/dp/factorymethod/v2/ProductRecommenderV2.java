package org.dp.factorymethod.v2;

import java.util.List;
/*
 * V2 Recommender改为抽象类，需要初始化一个推荐引擎。
 * RecommenderFactory 实例化Recommender时，需要传入Mercury推荐引擎
 * */
public class ProductRecommenderV2 {
    private IRecommenderFactory recommenderFactory = new RecommenderFactory();

    public List<String> recommend(String category) throws Exception {
        Recommender recommender = recommenderFactory.createRecommender(category);
        return recommender.recommend();
    }
}
