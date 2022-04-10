package sda.java.advanced.basics.queues;

import sda.java.advanced.basics.Collections.Car;

import java.util.Deque;
import java.util.LinkedList;

public class DeQueSample {

    public static void main(String[] args) {
        Car car1 = new Car("Volvo","2.0",190);
        Car car2 = new Car("Ford","1.6",160);
        Car car3 = new Car("BMW","3.2",260);
        Car car4 = new Car("Fiat","1.1",140);

        /**
         * Dequeue to kolejka dwukierunkowa:
         * - ma dostępny początek i koniec.
         * - można wstawiać elementy na początek i koniec.
         * - można wyjmować elementy z początku i z końca.
         * - można podgląać elementy z początku i z końca
         *
         * Oprócz dostępnych jak dla Queue metod offer, put, peek, poll, ...
         * mamy odpowiednio offerFirst, OfferLast, peekFirst, peekLast itd...
         *
         */

        Deque<Car> carDeque = new LinkedList<>();
        System.out.println("Wstawiamy element " + car1.getCarInfo());
        carDeque.offerFirst(car1);
        System.out.println("Podglądamy czoło kolejki: " + carDeque.peekFirst());
        System.out.println("Podglądamy ogon kolejki: " + carDeque.peekLast());
        System.out.println("==========================");
        System.out.println("Wstawiamy element " + car2.getCarInfo());
        carDeque.offerFirst(car2);
        System.out.println("Podglądamy czoło kolejki: " + carDeque.peekFirst());
        System.out.println("Podglądamy ogon kolejki: " + carDeque.peekLast());
        System.out.println("==========================");

        System.out.println("Wstawiamy element " + car3.getCarInfo());
        carDeque.offerFirst(car3);
        System.out.println("Podglądamy czoło kolejki: " + carDeque.peekFirst());
        System.out.println("Podglądamy ogon kolejki: " + carDeque.peekLast());
        System.out.println("==========================");

        System.out.println("Wstawiamy element " + car4.getCarInfo());
        carDeque.offerFirst(car4);
        System.out.println("Podglądamy czoło kolejki: " + carDeque.peekFirst());
        System.out.println("Podglądamy ogon kolejki: " + carDeque.peekLast());
        System.out.println("==========================");

        while(carDeque.size() > 0) {
            if(carDeque.size() % 2 == 0) {
                System.out.println("Wyciągamy element z początku kolejki");
                System.out.println(carDeque.pollFirst());
            } else {
                System.out.println("Wyciągamy element z końca kolejki");
                System.out.println(carDeque.pollLast());
            }
        }
        System.out.println("Ilość elementów w kolejce: " + carDeque.size());
    }
}
