package sda.java.advanced.basics.threads.basics;
import static sda.java.advanced.basics.threads.ThreadColor.ANSI_RED;
public class RunnableSample implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "RunnableSample class working");
    }
}
