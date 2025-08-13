package org.dp.strategy.v3;

import java.util.ArrayList;
import java.util.List;
/*
* V3 使用策略+简单工厂模式
* Recommender的setRecommendStrategy方法通过case逻辑设置不同的推荐策略
* 客户端代码和策略类彻底解藕
* */
public class Client {
    public static void main(String[] args) throws Exception {
        List<Mobile> mobiles = new ArrayList<>();
        mobiles.add(new Mobile("Huawei", 3200, 5100));
        mobiles.add(new Mobile("Xiaomi", 2500, 4800));
        mobiles.add(new Mobile("Vivo", 3000, 5200));

        Recommender panda = new Recommender("costPerformance");
        Mobile mobile = panda.recommend(mobiles);
        System.out.println("推荐的最具性价比手机是" + mobile.getName());

        panda.setRecommendStrategy("performance");
        mobile = panda.recommend(mobiles);
        System.out.println("推荐的性能最优手机是" + mobile.getName());

        panda.setRecommendStrategy("price");
        mobile = panda.recommend(mobiles);
        System.out.println("推荐的价格最高手机是" + mobile.getName());

    }
}
