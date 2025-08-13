package org.dp.factorymethod.v2;

public class RecommenderFactory implements IRecommenderFactory {
    @Override
    public Recommender createRecommender(String category)
            throws Exception {
        switch (category) {
            case "notebook":
                return new NotebookRecommender("Mercury");
            case "phone":
                return new PhoneRecommender("Mercury");
            case "television":
                return new TelevisionRecommender("Mercury");
            default:
                throw new Exception();
        }
    }
}
