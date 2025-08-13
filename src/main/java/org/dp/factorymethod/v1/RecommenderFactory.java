package org.dp.factorymethod.v1;

public class RecommenderFactory implements IRecommenderFactory {
    @Override
    public Recommender createRecommender(String category) throws Exception {
        switch (category){
            case "notebook":
                return new NotebookRecommender();
            case "phone":
                return new PhoneRecommender();
            case"television":
                return new TelevisionRecommender();
            default:
                throw new Exception();
        }
    }
}
