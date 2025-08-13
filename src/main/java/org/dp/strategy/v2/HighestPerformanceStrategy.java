package org.dp.strategy.v2;

import java.util.List;

public class HighestPerformanceStrategy implements RecommendStrategy {
    @Override
    public Mobile recommendMobile(List<Mobile> mobiles) {
        Mobile recommendMobile = null;

        for (Mobile mobile : mobiles) {
            if (recommendMobile == null) {
                recommendMobile = mobile;
            } else if (mobile.getPerformanceScore() >
                    recommendMobile.getPerformanceScore()) {
                recommendMobile = mobile;
            }
        }

        return recommendMobile;
    }
}
