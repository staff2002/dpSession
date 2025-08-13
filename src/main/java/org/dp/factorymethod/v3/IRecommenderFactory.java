package org.dp.factorymethod.v3;

public interface IRecommenderFactory {
    public Recommender createRecommender(String category) throws Exception;
}
