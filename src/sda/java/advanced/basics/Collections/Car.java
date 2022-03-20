package sda.java.advanced.basics.Collections;

import java.util.Objects;

/**
 * Klasa taka jak poniżej z konstruktorem ale bez setterów
 * to klasa niemutowalna (immutable) - bardzo wskazana przy programowaniu w wątkach/
 * bo z każdego miejsca odwołanie do obiektu zwróci to samo. Nie ma możliwości zmiany pól klasy.
 */
public class Car implements Comparable<Car> {
    private final String name;
    private final String engine;
    private final int maxSpeed;

    public Car(String name, String engine, int maxSpeed) {
        this.name = name;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * 1. Metoda "toString" nie powinna byc wykorzystywana "biznesowo" czyli do wyświetlania danych
     * w aplikacji
     * 2. Jeśli potrzebujemy wyświetlić dane to tworzymy dedykowane metody lub składamy "w locie"
     *
     */
    public String getCarInfo() {
        /**
         * String vs StringBuilder vs StringBuffer
         * 1. String odkłada wszystkie napisy na StringPool i NIE SĄ OE USUWANE przez GB (Garbage Collector)
         * 2. StringBuffer i StringBuilder "składają" napis i dopiero jak jest gotowy, zamieniony "toString"
         *    to w tedy ten gotowy ląduje na StringPool, a wcześniejsze są czyszczone
         * 3. StringBuffer działa od początku Javy (1.0) i jest bezpieczny w aplikacjach wielowątkowych
         *    ale przez to wolny
         * 4. StringBuilder działa od Javy (1.5), jest przeznaczony do aplikacji 1-wątkowych,
         *    ale dzięki temu szybki
         */
        return new StringBuilder("Car name: ")
                .append(name)
                .append(" , engine : ")
                .append(engine)
                .append(" , max speed : ")
                .append(maxSpeed)
                .toString();
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    /**
     * Kontrakt equals - hashCode
     * Jeśli dwa obiekty są sobie równe po porównaniu metodą equals to
     * ich hashCode MUSI być taki sam

        Jeśli hashCode dwóch obiektór jesdt taki sam to jeszcze nie znaczy że są one sobie równe
        po porównaniu equals
     */



    @Override
    public boolean equals(Object o) {
        // 1 Krok
        // Sprawdzamy czy referencje obiektów są taka same - czy idą do tego samego miejsca w pamięci
        if (this == o) return true;
        // 2 Krok
        // Sprawdzamy czy obiekt do porównania nie jest nullem i czy jest tej samej klasy
        // co obiekt z którym go porównujemy (np. obiekt klasy Drzewo z obiektem klasy Samochód)
        if (o == null || getClass() != o.getClass()) return false;
        // 3 Krok
        // Wiemy że obiekty są tej samej Klasy, bo inaczej wyszlibyśmy z metody krok wcześniej
        // W takim razie wyliczamy iloczyn equals dla poszczególnych wskazanych pól
        Car car = (Car) o; // rzutowanie obiektu "o" na klase "Car"
        return maxSpeed == car.maxSpeed && Objects.equals(name, car.name) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, engine, maxSpeed);
    }

    /**
     *
     * compareTo zwraca int:
     * wartość mniejsza od zera => "nasz obiekt" (this) jest "przed" obiektrem car przekazanym do metody
     * zero => obiekty są równe
     * wartość większa od zera => obiekt przekazany car jest przed "naszym obiektem this"
     *
     */

   @Override
    public int compareTo(Car car) {
        /**
         * Będziemy sortować po nazwie samochody alfabetycznie
         * więc wystarczy do compareTo dac porównanie nazw
         * Klasa String też implrementuje compareTo więc wykorzystujemy ten fakt
         */
       return this.name.compareTo(car.getName());
       // return car.getName().compareTo(name); // => odwrócona kolejnośc sortowania
    }



}
