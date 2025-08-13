package org.dp.simplefactory.v4;

public class RecommenderFactory {
    public Recommender createRecommender(String category)
            throws Exception {
        switch (category) {
            case "phone":
                return new PhoneRecommender();
            case "television":
                return new TelevisionRecommender();
            case "notebook":
                return new NotebookRecommender();
            default:
                throw new Exception();
        }
    }
}
