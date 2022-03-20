package sda.java.advanced.basics.abstractClass.czlowiek;

public class Student extends Czlowiek implements Kierowca {
    String kierunek;

    public Student(String name, String nazwisko, Gender gender) {
        super(name, nazwisko, Gender.MALE);
            }

    public String getKierunek() {
        return kierunek;
    }

    public void zmienKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    @Override
    public String dojedzDo() {
        return "Do domu po słoiki i pieniądze";
    }
}
