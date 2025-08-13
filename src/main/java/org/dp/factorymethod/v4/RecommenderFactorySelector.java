package org.dp.factorymethod.v4;

public class RecommenderFactorySelector {
    public IRecommenderFactory createFactory(String category) throws Exception {
        switch (category) {
            case "phone":
            case "television":
                return new RecommenderWithMercuryFactory();
            case "notebook":
                return new RecommenderWithMarsFactory();
            default:
                throw new Exception();
        }
    }
}
