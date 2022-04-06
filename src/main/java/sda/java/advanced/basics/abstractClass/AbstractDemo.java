package sda.java.advanced.basics.abstractClass;

public class AbstractDemo {
    public static void main(String[] args) {
        /**
         * Nie da się bezpośrednio zrobic obiektu z klasy abstrakcyjnej
         * chyba, że przy definicji obiektu od razu napiszemy "jednorazowe" ciało klasy
         */
//        Animal animal = new Animal() {
//           // tu powinno być "jednorazowe" ciało klasy
        Bird bird1 = new Bird("Jastrząb");
        bird1.move();

        Bee bee = new Bee("Maja");
        bee.move();

        Penguin penguin = new Penguin("Skipper");
        penguin.move();
        }
    }

