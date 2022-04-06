package sda.java.advanced.basics.Collections.maps;

import sda.java.advanced.basics.Collections.Car;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo","2.0",190);
        Car car2 = new Car("Ford","1.6",160);
        Car car3 = new Car("BMW","3.2",260);
        Car car4 = new Car("Fiat","1.1",140);

        /**
         * Mapa - struktura przechowujące dane w formacie Klucz-Wartość
         *
         * Map(K,V) - zakłada, że klucze muszą byc unikalne ale wartośći już nie koniecznie
         * czyli - klucze są niepowtarzalne
         * ale dla różnych kluczy moga wystąpić te same wartości
         *
         * Map to interfejs, konkretne implementacje to HashMap, LinkedHashMap, TreeMap
         * nazwy odnoszą się do faktu, że klucze mapy przechowywane są jako SET
         *
         */

        Map<String, Car> carMap = new HashMap<>();
        carMap.put(car1.getName(), car1);
        carMap.put(car2.getName(), car2);
        carMap.put(car3.getName(), car3);
        carMap.put(car4.getName(), car4);
        carMap.put("Inny Klucz", car1);
        carMap.put("Jeszcze inny klucz", car3);
        //Podmiana elementu pod wskazanym kluczem
        carMap.put(car1.getName(), car2);

        System.out.println("Wyświetlamy wartośći mapy - czyli samochody, użyjemy getCarInfo");
        System.out.println("Iterowanie po kluczach: ");
        for (String carName : carMap.keySet()) {
            System.out.println("Nazwa samochodu: " + carName);
            System.out.println("Info o samochodzie: " + carMap.get(carName).getCarInfo()); // get pobiera wartość spod wskazanego klucza
        }

        grubaKrecha();
        grubaKrecha();

        System.out.println("Iterowanie po wartościach");
        for (Car car : carMap.values()) {
            System.out.println("Kolejny raz info " + car.getCarInfo());
        }

        grubaKrecha();
        grubaKrecha();

        System.out.println("Iterowanie po wpisach");
        // Wpis to zestaw <klucz, wartość>
        for (Map.Entry<String, Car> entry : carMap.entrySet()) {
            System.out.println("Klucz: " + entry.getKey());
            System.out.println("Wartość: " + entry.getValue().getCarInfo());
        }

        grubaKrecha();
        carMap.remove(car3.getName());
        System.out.println("iterowanie po kluczach po usunięciu jednego elementu");
        for (String carName : carMap.keySet()) {
            System.out.println("Nazwa samochodu: " + carName);
            System.out.println("Info o samochodzie: " + carMap.get(carName).getCarInfo()); // get pobiera wartość spod wskazanego klucza

        }




        //Podmiana wartości elementu pod wskazanym kluczem

    }

    private static void grubaKrecha() {
        System.out.println("===================");
    }
}
