package sda.java.advanced.basics.abstractClass.czlowiek;

public class BrakWodyWyjatek extends IllegalArgumentException {

    public BrakWodyWyjatek(String s) {
        super(s);
        System.out.println("Brak wody !!! bo pozycja : " + s);
    }

}
