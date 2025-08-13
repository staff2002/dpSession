package org.dp.factorymethod.v4;

public interface IRecommenderFactory {
    Recommender createRecommender(String category) throws Exception;
}
