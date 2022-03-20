package sda.java.advanced.basics.Collections.sets.cwiczenie;


import sda.java.advanced.basics.Collections.CarComparedByEngine;

import sda.java.advanced.basics.Collections.sets.cwiczenie.Gender;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HumanDemo {
    public static void main(String[] args) {



    Human human1 = new Human("Maciek", "Pająk", 24, Gender.MALE);
    Human human2 = new Human("Joanna", "Byk", 19, Gender.FEMALE);
    Human human3 = new Human("Iza", "Sroka", 33, Gender.FEMALE);
    Human human4 = new Human("Wojtek", "Sikora", 22, Gender.MALE);
    Human human5 = new Human("Julia", "Pajak", 27, Gender.FEMALE);

    List<Human> humanList = new ArrayList<>();
    humanList.add(human1);
    humanList.add(human2);
    humanList.add(human3);
    humanList.add(human4);

        for (Human human : humanList) {
            System.out.println(human.getSurname() + " " + human.getName() + " " + human.getGender());
        }
        System.out.println();

    Set<Human> humanSet = new HashSet<>();
    humanSet.add(human1);
    humanSet.add(human2);
    humanSet.add(human3);
    humanSet.add(human4);
        for (Human human : humanSet) {
            System.out.println(human.getSurname() + " " + human.getAge() + " " + human.getGender());
        }
        System.out.println();
        Set<Human> treeSet = new TreeSet<>();
        treeSet.add(human1);
        treeSet.add(human2);
        treeSet.add(human3);
        treeSet.add(human4);
        treeSet.add(human5);
        System.out.println("Wyświetlamy treeSet: ");
        for (Human human : treeSet) {
            System.out.println(human.getSurname().compareTo(human.getSurname()));

        }

        System.out.println("=============Zewetrzne compare========");
        System.out.println("=============Porównanie po nazwisku i imieniu od Z do A========");
        Collections.sort(humanList, new HumanCompareBySurnameAndNameFromZToA());
        printHumanList(humanList);
        System.out.println("=============Porównanie po wieku i Imieniu========");
        Collections.sort(humanList, new HumanCompareByAgeAndName());
        printHumanList(humanList);
        System.out.println("=============Porównanie po płci i wieku========");
        Collections.sort(humanList, new HumanCompareByGenderAndAge());
        printHumanList(humanList);

    }

    private static void printHumanList(List<Human> humanList) {
        for (Human human : humanList) {
            System.out.println(human.getSurname() + " " + human.getName() + " " + human.getAge() + " " + human.getGender());
        }
    }
}


