import Bean.Person;
import Bean.Preference;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;

/**
 * Created by Mike on 11/15/2016.
 */
public class Recommendation {

    //计算欧几里得距离
    public static double getSimDistance(Person person1,Person person2){

        double sumOfSquare = 0.0;

        for (Preference preference: person1.getPreferenceArray()){
            if (person2.hasPreference(preference.getPrefName())){

                double person2Score = person2.getScoreByName(preference.getPrefName());
                sumOfSquare +=  Math.pow(preference.getPrefScore() - person2Score,2);

            }
        }

        return (1 / (1 + Math.sqrt(sumOfSquare)));
    }



    //计算皮尔逊相关系数
    public static double getPearson(Person person1, Person person2){

        ArrayList<Preference> person1List = new ArrayList<>();
        ArrayList<Preference> person2List = new ArrayList<>();

        for (int i =0;i<person1.getPreferenceArray().size();i++){
            if (person2.hasPreference(person1.getPreferenceArray().get(i).getPrefName())){
                person1List.add(person1.getPreferenceArray().get(i));
                person2List.add(person2.getPrefByName(person1.getPreferenceArray().get(i).getPrefName()));
            }
        }

        double sum1 = 0.0;
        double sum2 = 0.0;
        double sum1Sq = 0.0;
        double sum2Sq = 0.0;
        double pSum = 0.0;

        for (int i =0;i<person1List.size();i++){
            sum1 += person1List.get(i).getPrefScore();
            sum2 += person2List.get(i).getPrefScore();

            sum1Sq += Math.pow(person1List.get(i).getPrefScore(),2);
            sum2Sq += Math.pow(person2List.get(i).getPrefScore(),2);

            pSum += person2List.get(i).getPrefScore() * person1List.get(i).getPrefScore();

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
