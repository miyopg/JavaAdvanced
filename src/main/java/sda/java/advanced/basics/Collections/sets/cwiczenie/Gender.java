package sda.java.advanced.basics.Collections.sets.cwiczenie;

public enum Gender {
    MALE(2),
    FEMALE(1);

    private int index;

    Gender(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
