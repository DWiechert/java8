package example3;

import java.util.List;

import common.ListMaker;
import common.Person;

/**
 * Shows mapping the java 8 way.
 * 
 * @author Dan Wiechert
 */
public class Java8 {
    public static void main(final String[] args) {
        final List<Person> persons = ListMaker.createPersons();

        persons.stream().map(p -> p.getName().length()).forEach(nl -> System.out.println(nl));
    }
}
