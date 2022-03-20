package sda.java.advanced.basics.Collections.sets.cwiczenie;

import java.util.Comparator;

public class HumanCompareByGenderAndAge implements Comparator<Human> {

    @Override
    public int compare(Human human1, Human human2) {
        if(human1.getGender() != human2.getGender()) {
            return human1.getGender().getIndex() - (human2.getGender().getIndex());
        }
        return human1.getAge() - human2.getAge();
    }
}
