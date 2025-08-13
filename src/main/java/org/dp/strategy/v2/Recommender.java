package org.dp.strategy.v2;

import java.util.List;

public class Recommender {
    private RecommendStrategy recommendStrategy;

    public Recommender(RecommendStrategy recommendStrategy) {
        this.recommendStrategy = recommendStrategy;
    }

    public void setRecommendStrategy(
            RecommendStrategy recommendStrategy) {
        this.recommendStrategy = recommendStrategy;
    }

    public Mobile recommend(List<Mobile> mobiles) {
        return recommendStrategy.recommendMobile(mobiles);
    }
}
