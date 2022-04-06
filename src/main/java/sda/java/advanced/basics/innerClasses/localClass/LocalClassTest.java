package sda.java.advanced.basics.innerClasses.localClass;

public class LocalClassTest {
    public static void main(String[] args) {

        /**
         * Klasa lokalne jest powoływana wewnątrz metody i ma dostęp do rzeczy wewnątrz tej metody
         * i jest widoczna tylko w konktekście tej metody
         */
        class LocalPerson {
            private String personName;

            public LocalPerson(String personName) {
                this.personName = personName;
            }

            public String getPersonName() {
                return personName;
            }

        }

        LocalPerson localPerson = new LocalPerson("Osoba lokalna");
        System.out.println(localPerson.getPersonName());
    }
}
