package sda.java.advanced.basics.abstractClass.czlowiek;

public abstract class Czlowiek implements Zeglarz {
    private String name;
    private String nazwisko;

    private Gender gender; // enum prosty

    private Lokacja lokacja;
    private String aktualnaPozycja;
    private String miasto;


    public Czlowiek(String name, String nazwisko, Gender gender) {
        this.name = name;
        this.nazwisko = nazwisko;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Gender getGender() {
        return gender;
    }

    public Lokacja getLokacja() {
        return lokacja;
    }

    public String getAktualnaPozycja() {
        return aktualnaPozycja;
    }

    public String getMiasto() {
        return miasto;
    }

    public Lokacja adjustLocation(String nowaLokacja) {
        //TODO add setting new location
        Lokacja znalezionaLokacja = Lokacja.znajdzPoKrotkiejNazwie(nowaLokacja);
        if(znalezionaLokacja != null) {
            System.out.println("Lokacja znaleziona, ustawiam na " + znalezionaLokacja.getPlName());
            lokacja = znalezionaLokacja;
        }
        return lokacja;
    }

    @Override
    public String plyn() {
        // Enum może sprawdzać przez ==
        if(lokacja == lokacja.LAD) {
            throw new BrakWodyWyjatek(lokacja.getPlName());
        }
        return "Skończone " + lokacja.getEngName();
    }
}
