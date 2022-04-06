package sda.java.advanced.basics.extending1;

public class Mammal extends Animal{

    private String carnivorous;

    public Mammal(String carnivorous) {
        this.carnivorous = carnivorous;
    }

    public Mammal(String name, String carnivorous) {
        super(name);
        this.carnivorous = carnivorous;
    }

    public String getCarnivorous() {
        return carnivorous;
    }

    public void setCarnivorous(String carnivorous) {
        this.carnivorous = carnivorous;
    }
}
