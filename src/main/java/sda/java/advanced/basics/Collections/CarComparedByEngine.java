package sda.java.advanced.basics.Collections;

import sda.java.advanced.basics.Collections.Car;

import java.util.Comparator;

/**
 * Klasa odpowiedzialna za sortowania samochodów po wielkości silnika
 *
 * Założenia:
 * 1. Domyslnie samochody sortujemy po marce - do tego słuzy Comparable<Car> na klasie Car
 * 2. Mogą pojawić się potrzeby posortowania innego niż domyslne - do tego dokładamy właśnie osobne
 *    klasy - dla każdego takiego algorytmu osobną
 * 3. Do "dodatkowego" sortowania uzywamy interfejsy Comparator<Car>
 */
public class CarComparedByEngine implements Comparator<Car>{

    /**
     * Interfejs Comparator wymusza nadpisanie metody compare
     * ma teteż inne metody, ale są one domyślne, nie ma potrzeby ich nadpisywania - czyli można ale nie trzeba
     */

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getEngine().compareTo(car2.getEngine());
    }

}
