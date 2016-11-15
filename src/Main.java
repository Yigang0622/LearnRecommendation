import Bean.Person;
import Bean.Preference;

import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
        ArrayList<Person> personList = initPersonList();
        System.out.println(Recommendation.getSimDistance(personList.get(0),personList.get(1)));
        System.out.println(Recommendation.getPearson(personList.get(0),personList.get(1)));
    }


    private static ArrayList<Person> initPersonList(){

        ArrayList<Person> personList = new ArrayList<>();
        Person person1 = new Person("Lisa Rose");
        ArrayList<Preference> preferenceArrayList1 = new ArrayList<>();
        preferenceArrayList1.add(new Preference("Lady in the Water",2.5));
        preferenceArrayList1.add(new Preference("Snakes on a Plane",3.5));
        preferenceArrayList1.add(new Preference("Just My Luck",3.0));
        preferenceArrayList1.add(new Preference("Superman Returns",3.5));
        preferenceArrayList1.add(new Preference("You, Me and Dupree",2.5));
        preferenceArrayList1.add(new Preference("The Night Listener",3.0));
        person1.setPreferenceArray(preferenceArrayList1);


        Person person2 = new Person("Gene Seymour");
        ArrayList<Preference> preferenceArrayList2 = new ArrayList<>();
        preferenceArrayList2.add(new Preference("Lady in the Water",3));
        preferenceArrayList2.add(new Preference("Snakes on a Plane",3.5));
        preferenceArrayList2.add(new Preference("Just My Luck",1.5));
        preferenceArrayList2.add(new Preference("Superman Returns",5));
        preferenceArrayList2.add(new Preference("You, Me and Dupree",3.5));
        preferenceArrayList2.add(new Preference("The Night Listener",3.0));
        person2.setPreferenceArray(preferenceArrayList2);

        Person person3 = new Person("Michael Phillips");
        ArrayList<Preference> preferenceArrayList3 = new ArrayList<>();
        preferenceArrayList3.add(new Preference("Lady in the Water",2.5));
        preferenceArrayList3.add(new Preference("Snakes on a Plane",3.0));
        preferenceArrayList3.add(new Preference("Superman Returns",3.5));
        preferenceArrayList3.add(new Preference("The Night Listener",4.0));
        person3.setPreferenceArray(preferenceArrayList3);


        Person person4 = new Person("Claudia Puig");
        ArrayList<Preference> preferenceArrayList4 = new ArrayList<>();
        preferenceArrayList4.add(new Preference("Snakes on a Plane",3.5));
        preferenceArrayList4.add(new Preference("Just My Luck",3.0));
        preferenceArrayList4.add(new Preference("Superman Returns",4.0));
        preferenceArrayList4.add(new Preference("The Night Listener",4.5));
        preferenceArrayList4.add(new Preference("You, Me and Dupree",2.5));
        person4.setPreferenceArray(preferenceArrayList4);

        Person person5 = new Person("Mick LaSalle");
        ArrayList<Preference> preferenceArrayList5 = new ArrayList<>();
        preferenceArrayList5.add(new Preference("Lady in the Water",3.0));
        preferenceArrayList5.add(new Preference("Snakes on a Plane",4.0));
        preferenceArrayList5.add(new Preference("Just My Luck",2.0));
        preferenceArrayList5.add(new Preference("Superman Returns",3.0));
        preferenceArrayList5.add(new Preference("You, Me and Dupree",3.0));
        preferenceArrayList5.add(new Preference("The Night Listener",2.0));
        person5.setPreferenceArray(preferenceArrayList5);

        Person person6 = new Person("Jack Matthews");
        ArrayList<Preference> preferenceArrayList6 = new ArrayList<>();
        preferenceArrayList6.add(new Preference("Lady in the Water",3.0));
        preferenceArrayList6.add(new Preference("Snakes on a Plane",4.0));
        preferenceArrayList6.add(new Preference("Just My Luck",2.0));
        preferenceArrayList6.add(new Preference("Superman Returns",5.0));
        preferenceArrayList6.add(new Preference("You, Me and Dupree",3.5));
        preferenceArrayList6.add(new Preference("The Night Listener",3.0));
        person6.setPreferenceArray(preferenceArrayList6);

        Person person7 = new Person("Jack Matthews");
        ArrayList<Preference> preferenceArrayList7 = new ArrayList<>();
        preferenceArrayList7.add(new Preference("Snakes on a Plane",4.5));
        preferenceArrayList7.add(new Preference("Superman Returns",4.0));
        preferenceArrayList7.add(new Preference("You, Me and Dupree",1.0));
        person7.setPreferenceArray(preferenceArrayList7);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);

        return personList;

    }
}
