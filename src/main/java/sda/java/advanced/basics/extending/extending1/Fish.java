package sda.java.advanced.basics.extending1;

public class Fish extends Animal {

    private boolean freshwater;


    public Fish(String name, boolean freshwater) {
        super(name);
        this.freshwater = freshwater;
    }

    public boolean isFreshwater() {
        return freshwater;
    }

}
