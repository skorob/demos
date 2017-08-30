package lv.oskor.lambdas.collections;

import lv.oskor.lambdas.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Oleg Skorobogatov on 08.05.2017.
 */
public class ArrayToStream {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Oleg", 34));
        persons.add(new Person("Elvis", 35));
        persons.add(new Person("Olga", 65));
        persons.add(new Person("Janis", 75));

        Person[] arrayOfPersons = new Person[persons.size()];
        arrayOfPersons = persons.toArray(arrayOfPersons);

        Stream<Person> stream = Stream.of(arrayOfPersons);
        Stream<Person> stream1 = Arrays.stream(arrayOfPersons);
        stream.forEach(p -> System.out.println(p.getPersonInfo()));
        stream1.forEach(p -> System.out.println(p.getPersonInfo()));

    }
}
