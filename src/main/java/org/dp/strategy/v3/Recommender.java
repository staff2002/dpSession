package org.dp.strategy.v3;

import java.util.List;

public class Recommender {
    private RecommendStrategy recommendStrategy;

    public Recommender(String category) throws Exception {
        setRecommendStrategy(category);
    }

    public void setRecommendStrategy(String category) throws Exception {
        switch (category) {
            case "price":
                this.recommendStrategy = new HighestPriceStrategy();
                break;
            case "performance":
                this.recommendStrategy = new HighestPerformanceStrategy();
                break;
            case "costPerformance":
                this.recommendStrategy = new CostPerformanceStrategy();
                break;
            default:
                throw new Exception();
        }
    }

    public Mobile recommend(List<Mobile> mobiles) {
        return recommendStrategy.recommendMobile(mobiles);
    }
}
