package Bean;

/**
 * Created by Mike on 11/16/2016.
 */
public class RatingBean {

    public int userID = 0;
    public int movieID = 0;
    public double rating = 0;

    public RatingBean(int userID, int movieID, double rating) {
        this.userID = userID;
        this.movieID = movieID;
        this.rating = rating;
    }
}
