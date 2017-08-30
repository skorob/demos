package lv.oskor.lambdas.collections;

import lv.oskor.lambdas.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

/**
 * Created by Oleg Skorobogatov on 08.05.2017.
 */
public class SumAndAverageStream {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Oleg",34));
        persons.add(new Person("Elvis",35));
        persons.add(new Person("Olga",65));
        persons.add(new Person("Janis",75));

        Predicate<Person> pred = (p)-> p.getAge()>=65;

        int sum = persons.stream().mapToInt(p->p.getAge()).sum();
        System.out.println(sum);

        OptionalDouble avg = persons.stream().mapToInt(p-> p.getAge()).average();


        if(avg.isPresent()) {
            System.out.println("Average : "+avg.getAsDouble());
        } else {
            System.out.println("Average not calculated");
        }


    }


}
