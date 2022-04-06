package sda.java.advanced.basics.java8.functionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfacesExcersises {
    public static void main(String[] args) {
        /**
         * Na podstawie klasy bird
         * dołożyć :
     x    * implementacje Predicate sprawdzająca czy ptak to gołąb
     x    * implementacje Predicate sprawdzająca czy nazwa ptaka jest któtsza niż 10 znaków
         *
         * implementacje Suppliera zwracająca Kruka
         * wykorzystać ja wyświetlając (jakoś, np. jeśli któryś istniejący ptak to orzeł)
         *
     x    * implementację Consumera wyświetlającą: na jaką literę zaczyna się nazwa ptaka, długość nazwy ptaka
         *
     x    * implementację Function przyjmującą ptaka, zwracającą String z jego nazwą, długością nazwy i informacją
         * o tym na jaką Literę zaczyna się nazwa
         */
        Bird bird1 = new Bird("Orzeł");
        Bird bird2 = new Bird("Gołąb");
        Bird bird3 = new Bird("Kruk");
        Bird bird4 = new Bird("Wróbel");
        System.out.println("##################");
        System.out.println("##################");
        System.out.println("Predicate");

        Predicate<Bird> isGolab = (bird) -> "Gołąb".equals(bird.getBirdName());
        Predicate<Bird> checkBirdLength = (check) -> check.getBirdName().length() < 10;

        if(isGolab.test(bird1)) {
            System.out.println("Bird1 " + bird1.getBirdName() + " to Gołąb");
        }

        if(isGolab.test(bird2)) {
            System.out.println("Bird2 " + bird2.getBirdName() + " to Gołąb");
        }

        if(checkBirdLength.test(bird3)) {
            System.out.println("Bird3 lenght of name: " + bird3.getBirdName().length());
        }


        System.out.println("##################");
        System.out.println("##################");
        System.out.println("Supplier");

        Supplier<Bird> kruk = () -> bird3;
        Supplier<Bird> kruk2 = () -> new Bird("Kruk");

        if("Orzeł".equalsIgnoreCase(bird1.getBirdName())) {
            System.out.println("Orzeł aseked Kruk to support: " + kruk2.get().getBirdName());
        }

        System.out.println("##################");
        System.out.println("##################");
        System.out.println("Consumer");

        Consumer<Bird> printFirstLetterOfBirdName = (Bird) -> {
            System.out.println("Printing first letter of " + Bird.getBirdName());
            System.out.println(Bird.getBirdName().charAt(0));
        };
        printFirstLetterOfBirdName.accept(bird1);
        printFirstLetterOfBirdName.accept(bird2);

            // albo StringBuilder

            Consumer<Bird> birdSpecialInfo = (bird -> {
                StringBuilder result = new StringBuilder()
                        .append("First letter: ")
                        .append(bird.getBirdName().charAt(0))
                        .append(", bird lenght: ")
                        .append(bird.getBirdName().length());
                System.out.println(result);
            });

            birdSpecialInfo.accept(bird4);





        Consumer<Bird> printLengthOfBirdName = (Bird) -> {
            System.out.println("Printing lenght name of " + Bird.getBirdName());
            System.out.println(Bird.getBirdName().length());
        };

        printLengthOfBirdName.accept(bird3);
        printLengthOfBirdName.accept(bird4);


        System.out.println("##################");
        System.out.println("##################");
        System.out.println("Function");

        Function<Bird, String> birdInfo = (bird) -> "Name of Bird: " + bird.getBirdName() + "\n" + "" +
                "Bird's name length: " +  bird.getBirdName().length() + "\n" +
                "First letter of Bird: " + bird.getBirdName().charAt(0);
        System.out.println(birdInfo.apply(bird3));

        Function<Bird, String> birdInfo2 = (bird) -> {
            return new StringBuilder(bird.getBirdName())
                    .append(", name length: ")
                    .append(bird.getBirdName().length())
                    .append(", first letter: ")
                    .append(bird.getBirdName().charAt(0))
                    .toString();
        };
        System.out.println(birdInfo2.apply(bird4));



    }

}
