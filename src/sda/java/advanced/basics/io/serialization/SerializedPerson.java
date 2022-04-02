package sda.java.advanced.basics.io.serialization;

import java.io.Serializable;

/**
 * Serializable jest tzw. Flag InterFace czyli interfejsem - znacznikiem
 * co oznacza że nie musimy implementować żadnej metody aby klasa spełniała
 * ten interfesj, po prostu odblokowujemy dodatkowe możliwości dla klasy
 */


public class SerializedPerson implements Serializable {

    /**
     * transient będzie oznaczał, że takie pole ma nie być pakowane do strumienia podczas serializacji obiektu
     * a podczas jego odczytywania (deserializacji) zakładamy że to pole nie będzie uzupełnione:
     * system wypełni je wartośćią domyślną (String - unll, int - 0, boolean - false, itp..
     *
     */

    private transient int id;
    private String name;
    private String surname;
    private int age;

    public SerializedPerson(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SerializedPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
