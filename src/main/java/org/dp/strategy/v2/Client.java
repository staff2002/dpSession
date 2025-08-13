package org.dp.strategy.v2;

import java.util.ArrayList;
import java.util.List;
/*
 * V2 策略模式实现
 * 增加 Recommender 类，负责根据需要的策略进行推荐。
 * 客户端只需要依赖 Recommender， 符合迪米特法则
 * */
public class Client {
    public static void main(String[] args) {
        List<Mobile> mobiles = new ArrayList<>();
        mobiles.add(new Mobile("Huawei", 3200, 5100));
        mobiles.add(new Mobile("Xiaomi", 2500, 4800));
        mobiles.add(new Mobile("Vivo", 3000, 5200));

        Recommender panda = new Recommender(new CostPerformanceStrategy());
        Mobile mobile = panda.recommend(mobiles);
        System.out.println("推荐的最具性价比手机是" + mobile.getName());

        panda.setRecommendStrategy(new HighestPerformanceStrategy());
        mobile = panda.recommend(mobiles);
        System.out.println("推荐的性能最优手机是" + mobile.getName());

        panda.setRecommendStrategy(new HighestPriceStrategy());
        mobile = panda.recommend(mobiles);
        System.out.println("推荐的价格最高手机是" + mobile.getName());

    }
}
