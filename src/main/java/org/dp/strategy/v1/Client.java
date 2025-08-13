package org.dp.strategy.v1;

import java.util.ArrayList;
import java.util.List;
/*
* V1 简单工厂实现
* 问题：客户端依赖 n 种策略类，违反迪米特法则
* */
public class Client {
    public static void main(String[] args) throws Exception {
        List<Mobile> mobiles = new ArrayList<>();
        mobiles.add(new Mobile("Huawei", 3200, 5100));
        mobiles.add(new Mobile("Xiaomi", 2500, 4800));
        mobiles.add(new Mobile("Vivo", 3000, 5200));

        RecommendStrategyFactory recommendStrategyFactory =
                new RecommendStrategyFactory();

        RecommendStrategy highestPriceStrategy = recommendStrategyFactory.createStrategy("price");
        Mobile mobile = highestPriceStrategy.recommendMobile(mobiles);
        System.out.println("推荐的最具性价比手机是" + mobile.getName());

        RecommendStrategy highestPerformanceStrategy = recommendStrategyFactory.createStrategy("performance");
        mobile = highestPerformanceStrategy.recommendMobile(mobiles);
        System.out.println("推荐的性能最优手机是" + mobile.getName());

        RecommendStrategy costPerformanceStrategy = recommendStrategyFactory.createStrategy("costPerformance");
        mobile = costPerformanceStrategy.recommendMobile(mobiles);
        System.out.println("推荐的价格最高手机是" + mobile.getName());
    }
}
