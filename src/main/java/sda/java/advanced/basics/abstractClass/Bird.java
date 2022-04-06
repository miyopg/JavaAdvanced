package sda.java.advanced.basics.abstractClass;

/**
 * W klasie Bird nie ma żadnych pól ale ponieważ Animal ma pole "name"
 * to musimy w Bird zdefiniować konstruktor w którym to pole przekażemy do konstruktora nadklasy
 */
public class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Ptak lata");
    }
}
