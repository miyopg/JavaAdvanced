package sda.java.advanced.basics.java8.functionalInterfaces.consumer;

import sda.java.advanced.basics.java8.functionalInterfaces.Traveller;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Traveller traveller1 = new Traveller("Jan", "Kowalski");
        Traveller traveller2 = new Traveller("Alina", "Malina");

        /**
         * Consumer jest interfejsem funkcyjnym który przyjmuje obiekt
         * jako paramtr i nic nie zwraca
         */

        Consumer<Traveller> printTravellerInfo = (traveller) -> {
            System.out.println("Printing traveler info");
            System.out.println(traveller.travellerInfo());
        };
        printTravellerInfo.accept(traveller1);
        System.out.println("===============");
        printTravellerInfo.accept(traveller2);
    }
}
