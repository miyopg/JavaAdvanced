package sda.java.advanced.basics.interfaces;

public class Programmer implements OOPcoding{
    String name;

    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public void code(String language) {
        System.out.println(name + " makes simple code in " + language);
    }

    @Override
    public void codeOOP(String language) {
        System.out.println(name + " is crazy enough to code in " + language);
    }
}
