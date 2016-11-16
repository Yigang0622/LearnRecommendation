import Bean.Movie;
import Bean.RecommendationBean;
import Bean.Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Mike on 11/15/2016.
 */
public class Recommendation {

    //计算欧几里得距离
    public static double getSimDistance(Movie movie1, Movie movie2){

        double sumOfSquare = 0.0;

        for (Review item : movie1.getReviewArray()){
            if (movie2.hasSameReviewer(item.getReviewerName())){

                double person2Score = movie2.getScoreByName(item.getReviewerName());
                sumOfSquare +=  Math.pow(item.getReviewScore() - person2Score,2);

            }
        }

        return (1 / (1 + Math.sqrt(sumOfSquare)));
    }

    private static  Movie getMovieByName(ArrayList<Movie> dataBase,String name){
        for (Movie movie:dataBase){
            if (movie.getMovieName().equals(name)) {
                return movie;
            }
        }
        return null;
    }

    public static List<RecommendationBean> topMatches(ArrayList<Movie> dataBase, String movieName, int n){

        Movie thisMovie = getMovieByName(dataBase,movieName);

        ArrayList<RecommendationBean> recommendationList = new ArrayList<>();

        for (Movie movie:dataBase){
            if (!movie.getMovieName().equals(movieName)){
                recommendationList.add(new RecommendationBean(movie.getMovieName(),getPearson(movie,thisMovie)));
            }
        }

        Collections.sort(recommendationList);
        int lastIndex = n;
        if (n > recommendationList.size()-1){
            lastIndex = recommendationList.size() ;
        }

        return recommendationList.subList(0,lastIndex);

    }


    //计算皮尔逊相关系数
    public static double getPearson(Movie movie1, Movie movie2){

        ArrayList<Review> person1List = new ArrayList<>();
        ArrayList<Review> person2List = new ArrayList<>();

        for (int i = 0; i< movie1.getReviewArray().size(); i++){
            if (movie2.hasSameReviewer(movie1.getReviewArray().get(i).getReviewerName())){
                person1List.add(movie1.getReviewArray().get(i));
                person2List.add(movie2.getPrefByName(movie1.getReviewArray().get(i).getReviewerName()));
            }
        }

        double sum1 = 0.0;
        double sum2 = 0.0;
        double sum1Sq = 0.0;
        double sum2Sq = 0.0;
        double pSum = 0.0;

        for (int i =0;i<person1List.size();i++){
            sum1 += person1List.get(i).getReviewScore();
            sum2 += person2List.get(i).getReviewScore();

            sum1Sq += Math.pow(person1List.get(i).getReviewScore(),2);
            sum2Sq += Math.pow(person2List.get(i).getReviewScore(),2);

            pSum += person2List.get(i).getReviewScore() * person1List.get(i).getReviewScore();

        }
        int n = person1List.size();
        double num = pSum - ((sum1*sum2)/n);
        double den = Math.sqrt( (sum1Sq - Math.pow(sum1,2)/n) * (sum2Sq - Math.pow(sum2,2)/n) );

        if (den ==0){
            return 0;
        }else {
            return num/den;
        }

    }

}
