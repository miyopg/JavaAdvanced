package sda.java.advanced.basics.Collections.sets.cwiczenie;

import java.util.Comparator;

public class HumanCompareBySurnameAndNameFromZToA implements Comparator<Human> {

    @Override
    public int compare(Human human1, Human human2) {
        //Szeregowanie po nazwisku
        if(!human1.getSurname().equals(human2.getSurname())) {
            return human2.getSurname().compareTo(human1.getSurname());
        }


        return human2.getName().compareTo(human1.getName());
    }
}