package sda.java.advanced.basics.Collections.sets.cwiczenie;



import java.util.Objects;

public class Human implements Comparable<Human> {
    private String name;
    private String surname;
    private int age;
    private Gender gender;




    public Human(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;


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

    public Gender getGender() {
        return gender;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && gender == human.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, gender);
    }

    @Override
    public int compareTo(Human human) {
       return this.surname.compareTo(human.surname);
    }



}
