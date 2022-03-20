package sda.java.advanced.basics.abstractClass.czlowiek;

public class Sprzedawca extends Czlowiek implements Kierowca {
    private String branza;
    private String jedzDoPracy;
    private String jedzDoDomu;
    private boolean czyPracuje;

    public Sprzedawca(String name, String nazwisko, Gender gender) {
        super(name, nazwisko, gender);

    }

    public String getBranza() {
        return branza;
    }
    /**
     * Nie setter tylko zmianaBranzy BO:
     * - setter "biznesowa" nic nie mówie, natomiast "zmiana" oznacza "zmień", można
     * badać przyczynę, mamy większą czytelność kodu.
    */
    public void zmianaBranzy(String branza) {
        this.branza = branza;
    }

    public void setJedzDoPracy(String jedzDoPracy) {
        this.jedzDoPracy = jedzDoPracy;
    }

    public void setJedzDoDomu(String jedzDoDomu) {
        this.jedzDoDomu = jedzDoDomu;
    }

    public void setPracuje(boolean pracuje) {
        czyPracuje = pracuje;
    }

    public boolean isCzyPracuje() {
        return czyPracuje;
    }

    @Override
    public String dojedzDo() {
        //tenary operator czyli "jednolinijkowy if"
        return czyPracuje ? jedzDoPracy : jedzDoDomu;
    }
}
