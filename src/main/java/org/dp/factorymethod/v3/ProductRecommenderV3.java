package org.dp.factorymethod.v3;

import java.util.List;
/*
 * V3 增加两种Factory，分别生产Mercury引擎、Mars引擎的推荐器
 * ProductRecommender 选择实例化不同的工厂，获得相应引擎的推荐器，进行推荐
 * */
public class ProductRecommenderV3 {
    private IRecommenderFactory recommenderWithMercuryFactory = new RecommenderWithMercuryFactory();

    public List<String> recommend(String category) throws Exception {
        Recommender recommender = recommenderWithMercuryFactory.createRecommender(category);
        return recommender.recommend();
    }
}
