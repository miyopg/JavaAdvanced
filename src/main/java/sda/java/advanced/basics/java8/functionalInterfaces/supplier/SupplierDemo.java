package sda.java.advanced.basics.java8.functionalInterfaces.supplier;

import sda.java.advanced.basics.java8.functionalInterfaces.Traveller;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Traveller traveller1 = new Traveller("Jan", "Kowalski");
        Traveller traveller2 = new Traveller("Alina", "Malina");

        /**
         * Supplier jest interfejsem funkcyjnym który nie przyjmuje
         * żadnego parametru a zwraca obiekt
         * Korzystanie z Suppliera oznacza, że definiujemy jego metodę get
         */

        Supplier<Traveller> childTraveller = () -> new Traveller("Julcia","Masztalska");
        Supplier<Traveller> elder = () -> new Traveller("Marek","Pastor");

        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(traveller1.travellerInfo());
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(childTraveller.get().travellerInfo());
        System.out.println("+++++++++++++++++++++++++++");
        Traveller trainer = elder.get();
        System.out.println(trainer.travellerInfo());

        /**
         * z interfejsów bardzo fajnie korzysta się w połączneniu z metodami
         */

        System.out.println(travellerExtendedInfo(childTraveller));
        System.out.println("#################################");
        System.out.println(travellerExtendedInfo(elder));
        System.out.println("#################################");
        System.out.println("Z istniejącego obiektu też możemy zrobić suppliera!!!!!!!!!");
        System.out.println(travellerExtendedInfo(() -> traveller1));
    }

    public static String travellerExtendedInfo(Supplier<Traveller> travellerToUse) {
        Traveller traveller = travellerToUse.get();
        return new StringBuilder("===============\n")
                .append(traveller.travellerInfo())
                .append("\n=====================")
                .toString();

    }
}
