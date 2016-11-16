import Bean.Movie;
import Bean.RatingBean;
import Bean.Review;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mike on 11/16/2016.
 */
public class BeanUtil {

    public static List<Movie> generateMovieList(List<Movie> movieList,List<RatingBean> ratingList){

        System.out.println("开始数据拼接");

        int counter = 0;
        for (RatingBean ratingBean : ratingList){
            int id = ratingBean.movieID;
            int index = getMovieIndexByID(id,movieList);
            movieList.get(index).getReviewArray().add(new Review(String.valueOf(ratingBean.userID),ratingBean.rating));
            counter++;
            if (counter%500000 == 0){
                System.out.println("已完成："+counter+"/"+ratingList.size());
            }
        }

        return movieList;
    }

    private static int getMovieIndexByID(int movieID,List<Movie> movieList){
        for (int i=0;i<movieList.size();i++){
            if (movieList.get(i).id == movieID){
                return i;
            }
        }
        return 0;
    }

    private static List<RatingBean> getRatingsByID(int movieID,List<RatingBean> ratingList){

        List<RatingBean> returnList = new ArrayList<>();

        for (RatingBean ratingBean : ratingList){
            if (ratingBean.movieID == movieID){
                returnList.add(ratingBean);
            }
        }
        return returnList;

    }

}
