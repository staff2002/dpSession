package org.dp.factorymethod.v3;

public class RecommenderWithMarsFactory implements IRecommenderFactory {
    @Override
    public Recommender createRecommender(String category) throws Exception {
        switch (category){
            case "notebook":
                return new NotebookRecommender("Mars");
            case "phone":
                return new PhoneRecommender("Mars");
            case"television":
                return new TelevisionRecommender("Mars");
            default:
                throw new Exception();
        }
    }
}
