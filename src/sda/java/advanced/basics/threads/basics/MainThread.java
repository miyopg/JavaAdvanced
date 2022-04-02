package sda.java.advanced.basics.threads.basics;

import static sda.java.advanced.basics.threads.ThreadColor.*;

public class MainThread {
    public static void main(String[] args) {

        /**
         * Kolejność wykonywania wątków nie jest toższama z kolejnośćią ich wywołań w kodzie
         * CZYLI to że w 1 lini utworzymy i uruchomimy nowy wątek
         * nie oznacza, że zacznie on sie wykonywać od razu ani, że wykona się przed
         * kolejnymi liniami wątku głównego
         */

        System.out.println(ANSI_PURPLE + "MAIN thread in action");

        /**
         * Kod nowego wątku jest umieszczany w metodzie run()
         * ALE aby wystartować nowy wątek, wołamy metodę start()
         * Bo jeśli wywołamy metodę run() to nowy wątek się wcale nie stworzy
         * tylko program zadziała "linia po lini" w ramach jednego głównego wątku
         */

        SeparateThread separateThread = new SeparateThread();
        separateThread.start();
        separateThread.setName("======Osobny zajefajny wątek=======");
        //separateThread.run();

        /**
         * Jeśli korzystamy z interfejsu Runnable to wywołanie w osobnym wątku
         * należy opakować w klasę Thread (albo klasę która rozszerza Thread)
         */

        Thread runnableSample = new Thread(new RunnableSample());
        runnableSample.start();

        // RunnableSample sample = new RunnableSample(); - taka instrukcja nie wywoła osobnego wątku,
        // nie ma dostępnej metody start.

        /**
         * Wątek uruchamiany na klasie anonimowej
         * wtedy kiedy chcemy zrobi na zasadzie "uruchom i zapomnij"ć
         * i nie zamierzamy sprawdzać tego osobnego wątku
         */

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Anonymous class working as well");
            }
        }.start();

        /**
         * Można tymczasowo / jednorazowo nadpisać klasę np. RunnableSample
         * i na tej "jednorazówce" też odpalić wątek
         */

        runnableSample = new Thread(new RunnableSample() {
            @Override
            public void run() {
                System.out.println(ANSI_CYAN + "Overwritten RunnableSample");
                /**
                 * łączenie wątków metodą join() - będziemy czekać aż ten dołączony skończy robotę
                 */
               try {
                   separateThread.join();
                   System.out.println(ANSI_CYAN + "SeparateThread FINISHED, overwritten RunnableSample continues");
               } catch (InterruptedException e) {
                   System.out.println(ANSI_CYAN + "Overwritten RunnableSample interrupted");
               }
            }
        });
        runnableSample.start();

        //przerwa skeeoa w SeoarateThread
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        separateThread.interrupt();
        runnableSample.interrupt();

        System.out.println(ANSI_PURPLE + "End of MAIN thread");


    }
}
