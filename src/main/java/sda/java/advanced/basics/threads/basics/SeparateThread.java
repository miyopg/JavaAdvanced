package sda.java.advanced.basics.threads.basics;

import static sda.java.advanced.basics.threads.ThreadColor.ANSI_BLUE;

public class SeparateThread extends Thread {

    /**
     * Jak definiujemy klasę jako poszerzającą Thread to koniecznie należy
     * w tej naszej klasie nadpisać metodę run() która odpowiada za wykonanie zadań
     * które mają się znaleźć w osobnym wątku
     *
     */

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Separate thread is running");
        System.out.println(ANSI_BLUE + "Thread name: " + currentThread().getName());

        try {
            sleep(4000);
            System.out.println(ANSI_BLUE + currentThread().getName() + "sleeped enough");
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + currentThread().getName() + "INTERRUPTED");
        }

    }


}
