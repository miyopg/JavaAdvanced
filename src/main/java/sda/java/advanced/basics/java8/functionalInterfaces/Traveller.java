package sda.java.advanced.basics.java8.functionalInterfaces;

public class Traveller implements Movable{
    private String name;
    private String surname;

    public Traveller(String name, String surname) {
        System.out.println("Tworzymy nowy obiekt z imieniem: " + name + " i nazwiskiem: " + surname);
        this.name = name;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    //metoda abstrakcyjna w interfejsie, MUSIMY ją nadpisać
    @Override
    public String move() {
        return name  + " " + surname + " " + "is travelling";
    }

    //Metoda domyslna w interfejsie, MOŻEMY ale NIE MUSIMY jej nadpisywać
    @Override
    public String moveWith(String partner) {
        return move() + " but this time with " + partner;
    }

    public String travellerInfo() {
        return name + " " + surname;
    }

}
