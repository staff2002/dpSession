package org.dp.strategy.v3;

import java.util.List;

public class HighestPriceStrategy implements RecommendStrategy {
    @Override
    public Mobile recommendMobile(List<Mobile> mobiles) {
        Mobile recommendMobile = null;

        for (Mobile mobile : mobiles) {
            if (recommendMobile == null) {
                recommendMobile = mobile;
            } else if (mobile.getPrice() > recommendMobile.getPrice()) {
                recommendMobile = mobile;
            }
        }

        return recommendMobile;
    }
}
