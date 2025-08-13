package org.dp.strategy.v1;

public class RecommendStrategyFactory {
    public RecommendStrategy createStrategy(String category)
            throws Exception {
        switch (category) {
            case "price":
                return new HighestPriceStrategy();
            case "performance":
                return new HighestPerformanceStrategy();
            case "costPerformance":
                return new CostPerformanceStrategy();
            default:
                throw new Exception();
        }
    }
}
