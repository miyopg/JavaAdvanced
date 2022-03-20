package sda.java.advanced.basics.abstractClass.czlowiek;

public class AbstractDemo{
    public static void main(String[] args) {

   Student student1 = new Student("Jan", "Kowalski", Gender.MALE);
   Student student2 = new Student("Tomek", "Nowak", Gender.MALE);
   Sprzedawca sprzedawca1 = new Sprzedawca("Dariusz", "Młyn", Gender.MALE);
   Sprzedawca sprzedawca2 = new Sprzedawca("Ola", "Zieba", Gender.FEMALE);

   student1.zmienKierunek("Marketing");
   student2.zmienKierunek("Informatyka");
        System.out.println();
   sprzedawca1.zmianaBranzy("AGD");
   sprzedawca2.zmianaBranzy("Telefony");
        System.out.println();
   sprzedawca1.setJedzDoDomu("Kielce");
   sprzedawca1.setJedzDoPracy("Chorzów");
   sprzedawca1.setPracuje(true);
        System.out.println();
   sprzedawca2.setJedzDoDomu("Warszawa");
   sprzedawca2.setJedzDoDomu("Poznań");
   sprzedawca2.setPracuje(false);
        System.out.println();
   student1.adjustLocation("m");
   student2.adjustLocation("l");
        System.out.println();
   sprzedawca1.adjustLocation("a");
   sprzedawca2.adjustLocation("j");

        System.out.println();
        System.out.println("Student 1 pływa? : " + student1.plyn());
        try {
            System.out.println("Student 2 pływa ? " + student2.plyn());
        } catch (Exception e) {
            System.out.println("Olać wyjątki, jedziemy dalej, YOLO!");
        }
        System.out.println(sprzedawca1.getNazwisko() + " jedzie do " + sprzedawca1.dojedzDo() + " bo kierunek " + (sprzedawca1.isCzyPracuje() ? " praca " : " dom "));
        System.out.println(sprzedawca2.getNazwisko() + " jedzie do " + sprzedawca2.dojedzDo() + " bo kierunek " + (sprzedawca2.isCzyPracuje() ? " praca " : " dom "));

    }
}
