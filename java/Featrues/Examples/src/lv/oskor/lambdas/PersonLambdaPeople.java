package lv.oskor.lambdas;

import lv.oskor.lambdas.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Oleg Skorobogatov on 08.05.2017.
 */
public class PersonLambdaPeople {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Oleg",34));
        persons.add(new Person("Elvis",35));
        persons.add(new Person("Olga",65));
        persons.add(new Person("Janis",75));

        Collections.sort(persons, Person::compareAges);
        persons.forEach(p->System.out.println(p.getName()));


        PersonLambdaPeople inst = new PersonLambdaPeople();
        Collections.sort(persons, inst::compareAges);

    }

    public  int compareAges(Person p1, Person p2) {
        Integer age1 = p1.getAge();
        return age1.compareTo(p2.getAge());
    }

}
