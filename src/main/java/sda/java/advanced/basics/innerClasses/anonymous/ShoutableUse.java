package sda.java.advanced.basics.innerClasses.anonymous;

public class ShoutableUse {

    void shoutOnSomebody() {

        /**
         * tu mamy utworzenie klasy anonimowej
         * czyli
         * OBIEKTU
         * który
         * SPEŁNIA INTERFEJS Shoutable
         * ale
         * NIE MA OKREŚLONEGO TYPU KLASY
         * czyli nie ma konwencjii "class ShoutingPerson implements Shoutable{}"
         */

        Shoutable shoutable = new Shoutable() {
            @Override
            public String shout() {
                return "Yelling at yaaaaaa!!!!";
            }
        };
        System.out.println(shoutable.shout());

        /**
         * Powyższe można ( i Intellij sugeruje) żeby zamienić na lambdę
         */

        Shoutable lambdaShoutable = () -> "Lambda yelling at Yaaaa";
        System.out.println(lambdaShoutable.shout());
    }

}
