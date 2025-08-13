package org.dp.factorymethod.v4;

public class RecommenderWithMarsFactory implements IRecommenderFactory {
    @Override
    public Recommender createRecommender(String category)
            throws Exception {
        switch (category) {
            case "notebook":
                return new NotebookRecommender("Mars");
            default:
                throw new Exception();
        }
    }
}
