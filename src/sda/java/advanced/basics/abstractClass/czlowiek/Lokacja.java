package sda.java.advanced.basics.abstractClass.czlowiek;

import java.time.LocalDateTime;

public enum Lokacja {

    MORZE("m", "morze", "sea"),
    JEZIORO("j","jezioro","lake"),
    LAD("l","ląd","land");

    private String krotkaNazwa;
    private String plName;
    private String engName;

    Lokacja(String krotkaNazwa, String plName, String engName) {
        this.krotkaNazwa = krotkaNazwa;
        this.plName = plName;
        this.engName = engName;
    }

    public String getKrotkaNazwa() {
        return krotkaNazwa;
    }

    public String getPlName() {
        return plName;
    }

    public String getEngName() {
        return engName;
    }

    public static Lokacja znajdzPoKrotkiejNazwie(String krotkaNazwa) {
        for (Lokacja lokacja : Lokacja.values()) {
            if(krotkaNazwa.equalsIgnoreCase(lokacja.krotkaNazwa)) {
                return lokacja;
            }
        }
        return null;
    }
}
