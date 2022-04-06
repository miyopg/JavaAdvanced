package sda.java.advanced.basics.Collections.sets;

import sda.java.advanced.basics.Collections.Car;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo","2.0",190);
        Car car2 = new Car("Ford","1.6",160);
        Car car3 = new Car("BMW","3.2",260);
        Car car4 = new Car("Fiat","1.1",140);

        /**
         * SET to interfejs
         * Set - przechowuje zestaw niepowtarzalnych obiektów
         *  o niepowtarzalności decyduje zestaw hasjCode - equals
         *  Dostęp do dowolnego obiektu w Set jest bardzo szybki
         *  Obiekty w Set są niepoukładane. DOdanie nowego obiektu może zmienić kolejność np. przy wyświetlaniu
         */

        /**
         * HashSet
         * Najbardziej podstawowa, najcześciej wykorzystywana implementacja
         *
         */

        Set<Car> carSet = new HashSet<>();
        carSet.add(car1);
        carSet.add(car2);
        carSet.add(car3);
        carSet.add(car4);
        carSet.add(car2);
        carSet.add(car1);
        carSet.add(car4);

        for (Car car : carSet) {
            System.out.println(car.getName() + " " + car.getEngine() + " " + car.hashCode());
        }
        System.out.println();
        /**
         * LinkedHashSet pozwala na utrzymanie porządku elementów wg kolejnośći wstawiania
         */
        Set<Car> setSortedByEntering = new LinkedHashSet<>();
        setSortedByEntering.add(car1);
        setSortedByEntering.add(car2);
        setSortedByEntering.add(car3);
        setSortedByEntering.add(car4);
        System.out.println("Wyświetlamy LinkedHashSet");
        for(Car car : setSortedByEntering) {
            System.out.println(car.getName());
        }

        System.out.println();

        /**
         * TreeSet będzie układał elementy wg zdefiniowanego mechanizmu sortowania
         * Zdefiniowanie mechanizmu sortowania obiektów polega na dodaniu na obiekcie
         * (w naszym przypadku Car) interfejsu Comparable i napisaniu metody compareTo
         *
         * //car1.getName().compareTo(car2.getName());
         */

        Set<Car> treeSet = new TreeSet<>();
        treeSet.add(car1);
        treeSet.add(car2);
        treeSet.add(car3);
        treeSet.add(car4);
        System.out.println("Wyświetlamy treeSet");
        for (Car car : treeSet) {
            System.out.println(car.getName());

        }

    }
}
