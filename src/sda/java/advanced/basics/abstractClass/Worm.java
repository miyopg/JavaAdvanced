package sda.java.advanced.basics.abstractClass;

/**
 * Jedna klasa abstrakcyjna może dziedziczyć po innej klasie
 */

public abstract class Worm extends Animal{

    public Worm(String name) {
        super(name);
    }
    public abstract void hibernate();
}
