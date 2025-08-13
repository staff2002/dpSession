package org.dp.factorymethod.v4;

public class RecommenderWithMercuryFactory implements IRecommenderFactory {
    @Override
    public Recommender createRecommender(String category)
            throws Exception {
        switch (category) {
            case "phone":
                return new PhoneRecommender("Mercury");
            case "television":
                return new TelevisionRecommender("Mercury");
            default:
                throw new Exception();
        }
    }
}
