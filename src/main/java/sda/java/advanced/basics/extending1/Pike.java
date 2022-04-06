package sda.java.advanced.basics.extending1;

public class Pike extends Fish{
    private int weight;



    public Pike(String name, boolean freshwater, int weight) {
        super(name, freshwater);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
