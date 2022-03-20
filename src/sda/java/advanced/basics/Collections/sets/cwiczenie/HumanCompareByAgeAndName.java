package sda.java.advanced.basics.Collections.sets.cwiczenie;

import java.util.Comparator;

public class HumanCompareByAgeAndName implements Comparator<Human> {


    @Override
    public int compare(Human human1, Human human2) {
        //Szeregowanie po wieku
        if(human1.getAge() - human2.getAge() != 0) {
            return human1.getAge() - human2.getAge();
        }


        return human1.getName().compareTo(human2.getName());
    }


}
