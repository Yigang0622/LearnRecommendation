package Bean;

/**
 * Created by Mike on 11/16/2016.
 */
public class RecommendationBean implements Comparable {

    public int recommendationID = 0;
    public String recommendationName = "";
    public double recommendationScore = 1;


    public RecommendationBean(String recommendationName, double recommendationScore) {
        this.recommendationName = recommendationName;
        this.recommendationScore = recommendationScore;
    }

    public Boolean batterThan(RecommendationBean bean){
        return  recommendationScore > bean.recommendationScore;
    }

    @Override
    public int compareTo(Object o) {
        RecommendationBean bean = (RecommendationBean)o;

        if (batterThan(bean)){
            return -1;
        }else if (!batterThan(bean)){
            return 1;
        }

        return 0;
    }
}
