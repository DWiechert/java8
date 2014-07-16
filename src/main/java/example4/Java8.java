package example4;

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

        // Map each name to an Integer according to its length and then print that length
        persons.stream().map(p -> p.getName().length()).forEach(nl -> System.out.println(nl));
    }
}
