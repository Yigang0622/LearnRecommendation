import Bean.Movie;
import Bean.RatingBean;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mike on 11/16/2016.
 */
public class FileUtil {

    public static List<Movie> readMovieList(String path){

        List<Movie> movies = new ArrayList<>();

        System.out.println("开始加载电影列表("+path+")");
        try {
            Scanner in = new Scanner(new File(path));

            while (in.hasNextLine()) {
                String str = in.nextLine();
                if (!str.equals("movieId,title,genres")){
                    String[] arr = str.split(",");
                    int id = Integer.valueOf( arr[0] );
                    Movie movie = new Movie(id,arr[1]);
                    movies.add(movie);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(movies.size() + "个电影名称被加载");
        return movies;
    }

    public static List<RatingBean> readRatingList(String path){

        List<RatingBean> ratings = new ArrayList<>();

        System.out.println("开始加载评论列表("+path+")");
        try {
            Scanner in = new Scanner(new File(path));

            while (in.hasNextLine()) {
                String str = in.nextLine();
                if (!str.equals("userId,movieId,rating,timestamp")){
                    String[] arr = str.split(",");
                    int userID = Integer.valueOf( arr[0] );
                    int movieID = Integer.valueOf( arr[1] );
                    double rating = Double.valueOf( arr[2] );
                    ratings.add(new RatingBean(userID,movieID,rating));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(ratings.size() + "个评论被加载");
        return ratings;
    }

}
