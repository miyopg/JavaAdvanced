package sda.java.advanced.basics.java8.streams;

import java.util.Comparator;

public class HumanComparedBySurname implements Comparator<Human>{

        @Override
        public int compare(Human human1, Human human2) {
            return human2.getSurname().compareTo(human1.getSurname());
        }
    }


