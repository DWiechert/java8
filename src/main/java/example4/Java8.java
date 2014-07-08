package example4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import common.ListMaker;
import common.Person;

/**
 * Shows comparing the java 8 way.
 * 
 * @author Dan Wiechert
 */
public class Java8 {
    public static void main(final String[] args) {
        final List<Person> persons = ListMaker.createPersons();
        persons.addAll(ListMaker.createPersons2());

        // This is a lambda expression for the interface of Comparator.
        // It is in the form of (argument list) -> body
        final Comparator<Person> byEmail = (p1, p2) -> p1.getEmail().compareTo(p2.getEmail());
        Collections.sort(persons, Comparator.comparing(Person::getName).thenComparing(Person::getSex).thenComparing(byEmail));
        persons.forEach(p -> System.out.println(p));
    }
}
