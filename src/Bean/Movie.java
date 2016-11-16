package Bean;

import java.util.ArrayList;

/**
 * Created by Mike on 11/15/2016.
 */
public class Movie {

    public int id = 0;
    private String movieName = "";
    private ArrayList<Review> reviewArray = new ArrayList<>();

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    public Movie(int id , String movieName) {
        this.movieName = movieName;
        this.id = id;
    }

    public Movie(){

    }

    public Movie(String movieName, ArrayList<Review> reviewArray) {
        this.movieName = movieName;
        this.reviewArray = reviewArray;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public ArrayList<Review> getReviewArray() {
        return reviewArray;
    }

    public void setReviewArray(ArrayList<Review> reviewArray) {
        this.reviewArray = reviewArray;
    }

    public Boolean hasSameReviewer(String prefName){
        for (Review item : reviewArray){
            if (item.getReviewerName().equals(prefName)){
                return true;
            }
        }
        return false;
    }

    public double getScoreByName(String prefName){
        return getPrefByName(prefName).getReviewScore();
    }

    public Review getPrefByName(String prefName){
        for (Review item : reviewArray){
            if (item.getReviewerName().equals(prefName)){
                return item;
            }
        }
        return null;
    }

}
