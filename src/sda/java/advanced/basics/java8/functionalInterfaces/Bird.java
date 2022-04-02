package sda.java.advanced.basics.java8.functionalInterfaces;

public class Bird implements Movable{
    private String birdName;

    public Bird(String birdName) {
        this.birdName = birdName;
    }

    @Override
    public String move() {
        return birdName + " is flyiing!!!";
    }
}
