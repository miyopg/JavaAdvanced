package sda.java.advanced.basics.extending1;

public class Elephant extends Mammal{

    private int weight;

    public Elephant(String carnivorous, int weight) {
        super(carnivorous);
        this.weight = weight;
    }

    public Elephant(String name, String carnivorous, int weight) {
        super(name, carnivorous);
        this.weight = weight;
    }
}
