package sda.java.advanced.basics.Collections.sets.cwiczenie;

import sda.java.advanced.basics.Collections.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * dołożyć drukowanie listy w osobnym watku - np. klasa HumanReportPrinter
 * lista ma zawierać:
 * 1. Liczbę porządkową
 * 2. Nazwisko i imię
 * 3. Płeć
 *
 * Sugerowane aby nazwisko, imie i płeć zwracać dedykowaną metodą
 */
public class HumanReportPrinter extends Thread {



    @Override
    public void run() {
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
        humanList.add(human5);



        for (Human human : humanList) {



            System.out.println(humanList.indexOf(human) + " " + human.getSurname() + " " + human.getName() + " " + human.getGender());


        }


    }

}
