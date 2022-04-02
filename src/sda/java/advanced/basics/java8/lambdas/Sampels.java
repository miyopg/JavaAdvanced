package sda.java.advanced.basics.java8.lambdas;

public class Sampels {
    public static void main(String[] args) {
        /**
         * Lambda to skrócony zapis wywołania metody abstrakcyjnej
         * z interfejsu (funkcyjnego) - w takim interfesie musim być
         * dokładnie jedna metoda abstrakcyjna żeby system mógł się
         * DOMYŚLIĆ co chcemy wywołać
         */
        String aaa = "aaa";
        String bbb = "bbb";

        /**
         * adding to "implementacja interfejsu StringAdding, nie ma zapisu "override", nie ma nazwy klasy:
         * taka implementacja gdzie nie ma nazwy to klasa anonimowa
         * tam gdzie mamy operator -> to jest to lambda
         */
        // Lambda może zawierać tylko nazwy parametrów bez ich typów jeśli typy można wywnioskować
        StringAdding adding = (arg1, arg2) -> {return arg1 + "xxx" + arg2;};
        System.out.println(adding.add(aaa, bbb));
        System.out.println("===================");
        //Lambda może (czasem musi) zawierać typy parametrów
        StringAdding anotherAdding = (String par1, String par2) -> {return "zzz" + par1 + "uuu" + par2 + "www";};
        System.out.println(anotherAdding.add(aaa, bbb));
        System.out.println("===================");
        // Lambda może nie zawierać słowa kluczowego return i nawiasów klamrowych
        StringAdding noReturn = (arg1, arg2) -> arg1 + arg2;
        System.out.println(noReturn.add(aaa, bbb));
        System.out.println("==============");

        /**
         * Przykład z istniejącym wcześniej interfejsem i zapis PRE-JAVA8, POST-JAVA8
         */

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("++++++++++++++++++");
                System.out.println("Wypisanie czegoś w osobnym wątku");
                System.out.println("=========================");
            }
        });
        thread.start();

        //przy okazji lambda bez argumentów () -> {code}
        Thread anotherThread = new Thread(() -> {
            System.out.println("#########################");
            System.out.println("Tu też piszemy w osobnym wątku");
            System.out.println("#########################");
        });
        anotherThread.start();

    }
}
