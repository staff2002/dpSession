package org.dp.factorymethod.v4;

import java.util.List;
/*
* V4 增加FactorySelector，其实是综合运用了简单工厂
* recommenderFactorySelector负责根据品类选择适合的推荐器工厂
* */
public class ProductRecommenderV4 {
    private RecommenderFactorySelector recommenderFactorySelector = new RecommenderFactorySelector();

    public List<String> recommend(String category) throws Exception {
        IRecommenderFactory recommenderFactory = recommenderFactorySelector.createFactory(category);
        Recommender recommend = recommenderFactory.createRecommender(category);
        return recommend.recommend();
    }
}
