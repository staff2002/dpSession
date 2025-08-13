package org.dp.factorymethod.v1;

public interface IRecommenderFactory {
    Recommender createRecommender(String category) throws Exception;
}
