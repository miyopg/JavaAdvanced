package sda.java.advanced.basics.queues;

import sda.java.advanced.basics.Collections.Car;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo","2.0",190);
        Car car2 = new Car("Ford","1.6",160);
        Car car3 = new Car("BMW","3.2",260);
        Car car4 = new Car("Fiat","1.1",140);

        /**
         * Kolejka - queue
         * zakłada, że elementy zawsze trafiają na koniec kolejki a obsługiwane
         * są na początku, najbardziej intuicyjnym przykładem jest kolejka w sklepie,
         * ale taka kulturalna, nie ma opcji "ja stoję za panem tylko skoczę do mięsnego i apteki:
         *
         * Kolejka to inaczej FIFO - First In First Out
         */

        Queue<Car> carQueue = new LinkedList<>();
        /**
         * Dokładanie elementów można zrobić metodą:
         *
         * put - ale jak coś nie pójdzie to dostaniemy wyjątek
         * offer - jak coś nie pójdzie to nie będzie wyjątku
         *
         */
        carQueue.offer(car1); // dołożenie elementu na koniec kolejki
        System.out.println("Czoło kolejki " + carQueue.peek()); // podejrzenie "czoła" kolejki ( kto jest pierwszy )
        carQueue.offer(car2); // dołożenie elementu na koniec kolejki
        System.out.println("Czoło kolejki " + carQueue.peek()); // podejrzenie "czoła" kolejki ( kto jest pierwszy )
        carQueue.offer(car3); // dołożenie elementu na koniec kolejki
        System.out.println("Czoło kolejki " + carQueue.peek()); // podejrzenie "czoła" kolejki ( kto jest pierwszy )
        carQueue.offer(car4); // dołożenie elementu na koniec kolejki
        System.out.println("Czoło kolejki " + carQueue.peek()); // podejrzenie "czoła" kolejki ( kto jest pierwszy )

        System.out.println("=====================");
        System.out.println("Obsługujemy elementy wychodzące z kolejki");
        while(carQueue.size() > 0) {
            /**
             * Przy wyjmowaniu z kolejki używamy
             * poll (w razie błędu nie ma wyjątku)
             * remove (w razie błedu dostaniemy wyjątek)
             */
            System.out.println(carQueue.poll());
        }
        System.out.println("==========================");

    }
}
