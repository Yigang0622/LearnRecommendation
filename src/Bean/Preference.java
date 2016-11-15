package Bean;

/**
 * Created by Mike on 11/15/2016.
 */
public class Preference {

    private String prefName = "";
    private double prefScore = 0.0;

    public Preference(){

    }

    public Boolean isSamePref(Preference preference){
        return this.prefName.equals(preference.getPrefName());
    }

    public Preference(String prefName, double prefScore) {
        this.prefName = prefName;
        this.prefScore = prefScore;
    }

    public String getPrefName() {
        return prefName;
    }

    public void setPrefName(String prefName) {
        this.prefName = prefName;
    }

    public double getPrefScore() {
        return prefScore;
    }

    public void setPrefScore(double prefScore) {
        this.prefScore = prefScore;
    }



}
