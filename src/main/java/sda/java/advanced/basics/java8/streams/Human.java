package sda.java.advanced.basics.java8.streams;

import sda.java.advanced.basics.Collections.Car;

import java.math.BigDecimal;

public class Human implements Comparable<Human>{
    private String name;
    private String surname;
    private int age;

    public Human(String name, String surname, int age) {
        System.out.println("Konstruktor dla name = " + name + ", surname= " + surname);
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public void printHumanInfo() {
        System.out.println(getHumanInfo());

    }

    public String getHumanInfo() {
        return  new StringBuilder("Human: ").append(surname)
                .append(" ").append(name)
                .append(", age= ").append(age)
                .toString();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public String humanInfo() {
        return new StringBuilder("Name: ").append(name)
                .append(", surname: ").append(surname)
                .append(", age: ").append(age)
                .toString();
    }

    public BigDecimal objectedAge() {
        return BigDecimal.valueOf(age);
    }

    @Override
    public int compareTo(Human human) {
        if(age != human.getAge()) {
            return age - human.getAge();
        }
        return humanInfo().compareTo(human.humanInfo());
    }
}
