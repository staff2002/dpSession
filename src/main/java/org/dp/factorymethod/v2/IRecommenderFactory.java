package org.dp.factorymethod.v2;

public interface IRecommenderFactory {
    public Recommender createRecommender(String category) throws Exception;
}
