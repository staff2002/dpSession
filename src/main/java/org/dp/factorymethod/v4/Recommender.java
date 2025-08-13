package org.dp.factorymethod.v4;

import java.util.List;

public abstract class Recommender {
    protected String recommendEngine;

    public Recommender(String recommendEngine){
        this.recommendEngine = recommendEngine;
    }
    abstract List<String> recommend();
}
