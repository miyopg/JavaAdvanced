package sda.java.advanced.basics.java8.streams;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {
        /**
         * Java8 wprowadziła Optional
         * czyli "opakowanie" na obiekt
         * gdzie w środku może być obiekt a może go nie być
         */

        Human human = new Human("Jan", "Kowalski",33);
        Human nullHuman = null;

        System.out.println(human.getAge());
        // System.out.println(nullHuman.getAge()); - nullHuman jest Null stąd wywołanie na nim getAge kończy się NullPointerExceptions

        //metoda .of tworzy optionala na nie-nullowym obiekcie
        Optional<Human> optionalHuman = Optional.of(human);

        //metoda .ofNullable tworzy optionala na być-może-nullowym obiekcie
        Optional<Human> nullOptionalHuman = Optional.ofNullable(nullHuman);

        //stworzenie optionala z obiektu nullowego metodą of kończy się wyjątkiem
//        Optional<Human> anotherNullable = Optional.of(nullHuman);

        //od Javy8 - sprawdzenie zawartości metodą isEmpty
        if(nullOptionalHuman.isEmpty()) {
            System.out.println("Null w optionalu!!!!");
        }
        //od Javy11 - kolejna metoda sprawdzenia zawartości - pojawiła się bo najczęściej programiści
        //robili !isEmpty
        if(nullOptionalHuman.isPresent()) {
            System.out.println("Nie ma nulla w optionalu");
        }

        //pobranie zawartości Optionala
        // sugerowane jest aby najpierw sprawdzić czy jest co pobrać żeby nie skończyło się na czerwono
        // Human stupid = nullOptionalHuman.get(); - w ßrodku null wiéc dostaniemy exception
        Human finalHuman = optionalHuman.get();

    }
}
