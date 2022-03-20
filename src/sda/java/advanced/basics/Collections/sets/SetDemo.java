package sda.java.advanced.basics.Collections.sets;

import sda.java.advanced.basics.Collections.Car;

import java.util.HashSet;
import java.util.Set;

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
            System.out.println(car.getName() + " " + car.getEngine());
        }
    }
}
