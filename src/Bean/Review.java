package Bean;

/**
 * Created by Mike on 11/15/2016.
 */
public class Review {

    private String reviewerName = "";
    private double reviewScore = 0.0;

    public Review(){

    }

    public Boolean isSamePref(Review item){
        return this.reviewerName.equals(item.getReviewerName());
    }

    public Review(String reviewerName, double reviewScore) {
        this.reviewerName = reviewerName;
        this.reviewScore = reviewScore;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public double getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(double reviewScore) {
        this.reviewScore = reviewScore;
    }



}
