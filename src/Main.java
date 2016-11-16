import Bean.Movie;
import Bean.RatingBean;
import Bean.RecommendationBean;
import Bean.Review;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        ArrayList<Movie> movieList = initPersonList();
        //System.out.println(Recommendation.getSimDistance(movieList.get(0), movieList.get(3)));
      //  System.out.println(Recommendation.getPearson(movieList.get(0), movieList.get(1)));
        List list = Recommendation.topMatches(movieList,"Toby",443);
        System.out.println("Movie Recommendation Engine");
        System.out.println("Powered By Mike.Zhou");
        List<Movie> movies = FileUtil.readMovieList("C:\\Users\\Mike\\Desktop\\ml-latest\\movies.csv");
        List<RatingBean> ratings = FileUtil.readRatingList("C:\\Users\\Mike\\Desktop\\ml-latest\\ratings.csv");
        List<Movie> generated = BeanUtil.generateMovieList(movies,ratings);
    }


    private static ArrayList<Movie> initPersonList(){

        ArrayList<Movie> movieList = new ArrayList<>();
        Movie movie1 = new Movie("Lisa Rose");
        ArrayList<Review> itemArrayList1 = new ArrayList<>();
        itemArrayList1.add(new Review("Lady in the Water",2.5));
        itemArrayList1.add(new Review("Snakes on a Plane",3.5));
        itemArrayList1.add(new Review("Just My Luck",3.0));
        itemArrayList1.add(new Review("Superman Returns",3.5));
        itemArrayList1.add(new Review("You, Me and Dupree",2.5));
        itemArrayList1.add(new Review("The Night Listener",3.0));
        movie1.setReviewArray(itemArrayList1);


        Movie movie2 = new Movie("Gene Seymour");
        ArrayList<Review> itemArrayList2 = new ArrayList<>();
        itemArrayList2.add(new Review("Lady in the Water",3));
        itemArrayList2.add(new Review("Snakes on a Plane",3.5));
        itemArrayList2.add(new Review("Just My Luck",1.5));
        itemArrayList2.add(new Review("Superman Returns",5));
        itemArrayList2.add(new Review("You, Me and Dupree",3.5));
        itemArrayList2.add(new Review("The Night Listener",3.0));
        movie2.setReviewArray(itemArrayList2);

        Movie movie3 = new Movie("Michael Phillips");
        ArrayList<Review> itemArrayList3 = new ArrayList<>();
        itemArrayList3.add(new Review("Lady in the Water",2.5));
        itemArrayList3.add(new Review("Snakes on a Plane",3.0));
        itemArrayList3.add(new Review("Superman Returns",3.5));
        itemArrayList3.add(new Review("The Night Listener",4.0));
        movie3.setReviewArray(itemArrayList3);


        Movie movie4 = new Movie("Claudia Puig");
        ArrayList<Review> itemArrayList4 = new ArrayList<>();
        itemArrayList4.add(new Review("Snakes on a Plane",3.5));
        itemArrayList4.add(new Review("Just My Luck",3.0));
        itemArrayList4.add(new Review("Superman Returns",4.0));
        itemArrayList4.add(new Review("The Night Listener",4.5));
        itemArrayList4.add(new Review("You, Me and Dupree",2.5));
        movie4.setReviewArray(itemArrayList4);

        Movie movie5 = new Movie("Mick LaSalle");
        ArrayList<Review> itemArrayList5 = new ArrayList<>();
        itemArrayList5.add(new Review("Lady in the Water",3.0));
        itemArrayList5.add(new Review("Snakes on a Plane",4.0));
        itemArrayList5.add(new Review("Just My Luck",2.0));
        itemArrayList5.add(new Review("Superman Returns",3.0));
        itemArrayList5.add(new Review("You, Me and Dupree",3.0));
        itemArrayList5.add(new Review("The Night Listener",2.0));
        movie5.setReviewArray(itemArrayList5);

        Movie movie6 = new Movie("Jack Matthews");
        ArrayList<Review> itemArrayList6 = new ArrayList<>();
        itemArrayList6.add(new Review("Lady in the Water",3.0));
        itemArrayList6.add(new Review("Snakes on a Plane",4.0));
        itemArrayList6.add(new Review("Just My Luck",2.0));
        itemArrayList6.add(new Review("Superman Returns",5.0));
        itemArrayList6.add(new Review("You, Me and Dupree",3.5));
        itemArrayList6.add(new Review("The Night Listener",3.0));
        movie6.setReviewArray(itemArrayList6);

        Movie movie7 = new Movie("Toby");
        ArrayList<Review> itemArrayList7 = new ArrayList<>();
        itemArrayList7.add(new Review("Snakes on a Plane",4.5));
        itemArrayList7.add(new Review("Superman Returns",4.0));
        itemArrayList7.add(new Review("You, Me and Dupree",1.0));
        movie7.setReviewArray(itemArrayList7);

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);
        movieList.add(movie6);
        movieList.add(movie7);
        return movieList;

    }
}
