package Bean;

import java.util.ArrayList;

/**
 * Created by Mike on 11/15/2016.
 */
public class Person {

    public Person(String personName) {
        this.personName = personName;
    }

    private String personName = "";
    private ArrayList<Preference> preferenceArray = new ArrayList<>();

    public Person(){

    }

    public Person(String personName, ArrayList<Preference> preferenceArray) {
        this.personName = personName;
        this.preferenceArray = preferenceArray;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public ArrayList<Preference> getPreferenceArray() {
        return preferenceArray;
    }

    public void setPreferenceArray(ArrayList<Preference> preferenceArray) {
        this.preferenceArray = preferenceArray;
    }

    public Boolean hasPreference(String prefName){
        for (Preference preference:preferenceArray){
            if (preference.getPrefName().equals(prefName)){
                return true;
            }
        }
        return false;
    }

    public double getScoreByName(String prefName){
        return getPrefByName(prefName).getPrefScore();
    }

    public Preference getPrefByName(String prefName){
        for (Preference preference:preferenceArray){
            if (preference.getPrefName().equals(prefName)){
                return preference;
            }
        }
        return null;
    }

}
