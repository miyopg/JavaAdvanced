package sda.java.advanced.basics.java8.streams;

import sda.java.advanced.basics.Collections.sets.cwiczenie.HumanCompareBySurnameAndNameFromZToA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercises {
    public static void main(String[] args) {
        class HumanDTO {
            String name;
            String surname;

            public HumanDTO(String name, String surname) {
                this.name = name;
                this.surname = surname;
            }

            public String humanSummary() {
                return new StringBuilder("DTO: name=").append(name)
                        .append(", surname=").append(surname)
                        .toString();
            }

        }

        List<Human> people = new ArrayList<>();
        people.add(new Human("Jan", "Kowalski",22));
        people.add(new Human("Marek", "Kowalski",33));
        people.add(new Human("Paweł", "Kowalski",44));
        people.add(new Human("Marian", "Nowak",15));
        people.add(new Human("Paweł", "Wiewiór",55));
        people.add(new Human("Anna", "Jalewska",25));

        Set<Human> peopleSet = new HashSet<>();
        peopleSet.add(new Human("Agnieszka", "Zawilska", 25));
        peopleSet.add(new Human("Renata", "Zając", 33));
        peopleSet.add(new Human("Maria", "Rolecka", 57));
        peopleSet.add(new Human("Zofia", "Papciuch", 44));
        peopleSet.add(new Human("Edyta", "Jachimczak", 38));

        //1. złaczyć kolekcje i wyswietlic imiona wszystkich ludzi x
        //2. wybrac wszystkich ktorzy nazywaja sie paweł, renata albo agnieszka i wyswietlic
        //3.wyswietlic ludzi posortowanych po nazwisku od Z do A
        //4. wyswietlic sume wieku ludzi ale tylko starsztch niz 35 lat
        //5.wyswietlic złaczone imiona ludzi, miedzy nimi przecinek i spacja ale tylko mlodszych niz 40

        System.out.println("Zadanie 1 : Łączę kolekcje i wypisuje wszystkie imiona:");
        List<Human> humanCollect = Stream.of(people, peopleSet)
                .flatMap(coll -> coll.stream())
                .collect(Collectors.toList());


        System.out.println("==================");
                humanCollect.stream()
                        .map(human -> human.getName())
                        .forEach(System.out::println);
        System.out.println("==================");
        System.out.println("Zadanie 2. wybrac wszystkich ktorzy nazywaja sie paweł, renata albo agnieszka i wyswietlic\n");
        humanCollect.stream()
                .filter(human -> "Paweł".equalsIgnoreCase(human.getName()) ||
                        "Renata".equalsIgnoreCase(human.getName()) ||
                        "Agnieszka".equalsIgnoreCase(human.getName()))
                .forEach(Human::printHumanInfo);

        System.out.println("=====================");
        System.out.println("3. Wyswietlic ludzi posortowanych po nazwisku od Z do A");
        humanCollect.stream()
                .sorted(new HumanComparedBySurname())
                .forEach(Human::printHumanInfo);

        System.out.println("=====================");
        System.out.println("4. wyswietlic sume wieku ludzi ale tylko starszych niz 35 lat");

            int sumAgeAfter35 = humanCollect.stream()
                    .filter(human -> human.getAge() > 35)
                    .map(Human :: getAge)
                    .reduce(0, (currentAge, nextPersonAge) -> currentAge + nextPersonAge);
        System.out.println("Suma osób starszych niż 35 to: " + sumAgeAfter35);
        System.out.println("=====================");
        System.out.println("5.wyswietlic złaczone imiona ludzi, " +
                "miedzy nimi przecinek i spacja ale tylko mlodszych niz 40");
                String solutionFive = humanCollect.stream()
                        .filter(human -> human.getAge() < 40)
                        .map(Human::getName)
                        .collect(Collectors.joining(", "));
        System.out.println(solutionFive);
















    }
}
