package lv.oskor.lambdas;

import lv.oskor.lambdas.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Oleg Skorobogatov on 08.05.2017.
 */
public class PersonLambda {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Oleg",34));
        persons.add(new Person("Elvis",35));
        persons.add(new Person("Olga",65));
        persons.add(new Person("Janis",75));

        Predicate<Person> pred = (p)-> {return p.getAge()>=65;};

        persons.forEach(p-> {if(pred.test(p))
        {
            System.out.println(p.getName());
        }
        });

        persons.forEach(p-> {if(pred.test(p))
        {
            System.out.println(p.getPersonInfo());
        }
        });
    }


}
