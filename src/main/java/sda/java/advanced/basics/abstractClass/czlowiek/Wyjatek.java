package sda.java.advanced.basics.abstractClass.czlowiek;

public class Wyjatek extends IllegalArgumentException {

    public Wyjatek(String aktualnaPozycja) {
        super(aktualnaPozycja);
            System.out.println("Niepoprawna pozycja");

        }
    }

