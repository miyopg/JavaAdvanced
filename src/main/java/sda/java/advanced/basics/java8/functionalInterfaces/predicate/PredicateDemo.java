package sda.java.advanced.basics.java8.functionalInterfaces.predicate;

import sda.java.advanced.basics.java8.functionalInterfaces.Traveller;

import java.util.function.Predicate;


public class PredicateDemo {

    public static void main(String[] args) {
        Traveller traveller1 = new Traveller("Jan", "Kowalski");
        Traveller traveller2 = new Traveller("Alina", "Nowak");
        Traveller traveller3 = new Traveller("Józef", "Nowak");
        Traveller traveller4 = new Traveller("Katarzyna", "Zawilska");

        /**
         * Predicate to interfejs fukncyjny który przyjmuje obiekt i sprawdza
         * czy spełniony jest jakiś warunek, zwraca boolean
         * Wykorzystując interfejs Predicate definiujemy jego metodę test
         */

        Predicate<Traveller> isNowak = (x) -> "Nowak".equals(x.getSurname());
        Predicate<Traveller> isLongerThen10 = (check) -> check.travellerInfo().length() > 10;

        if(isNowak.test(traveller1)) {
            System.out.println("Traveller1 " + traveller1.travellerInfo() + " ma na nazwisko Nowak!");
        }
        if(isNowak.test(traveller2)) {
            System.out.println("Traveller2 " + traveller2.travellerInfo() + " ma na nazwisko Nowak!");
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
        printIfTestPassed(traveller1, isNowak);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
        printIfTestPassed(traveller1, isLongerThen10);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
        printIfTestPassed(traveller3, isNowak);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
        printIfTestPassed(traveller3, isLongerThen10);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
        printIfTestPassed(traveller4, isLongerThen10);
    }

    private static void printIfTestPassed(Traveller traveller, Predicate<Traveller> checkToPerform) {
        if (checkToPerform.test(traveller)) {
            System.out.println("**************");
            System.out.println("check passed");
            System.out.println(traveller.travellerInfo());
            System.out.println("**************");
        }
    }
}
