package sda.java.advanced.basics.threads.counter;

public class ThreadCounter extends Thread {

    private Counter counter;

    public ThreadCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.performCountdown();
    }
}
