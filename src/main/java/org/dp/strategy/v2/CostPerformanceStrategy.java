package org.dp.strategy.v2;

import java.util.List;

public class CostPerformanceStrategy implements RecommendStrategy {
    @Override
    public Mobile recommendMobile(List<Mobile> mobiles) {
        Mobile recommendMobile = null;

        for (Mobile mobile : mobiles) {
            if (recommendMobile == null) {
                recommendMobile = mobile;
            } else {
                double highestScore = recommendMobile.getPerformanceScore() / recommendMobile.getPrice();
                double score = mobile.getPerformanceScore() / mobile.getPrice();
                if (score > highestScore) {
                    recommendMobile = mobile;
                }
            }
        }

        return recommendMobile;
    }
}
