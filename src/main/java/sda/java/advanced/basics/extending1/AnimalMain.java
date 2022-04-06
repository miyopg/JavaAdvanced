package sda.java.advanced.basics.extending1;

public class AnimalMain {
        public static void main(String[] args) {
                Pike pike = new Pike("Szczupak", true, 7);
                System.out.println("Ryba to: " + pike.getName() + " Słodkowodny: " + pike.isFreshwater() + ", o wadze: " + pike.getWeight() + " kg");
        }
}
