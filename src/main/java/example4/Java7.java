package example4;

import java.util.ArrayList;
import java.util.List;

import common.ListMaker;
import common.Person;

/**
 * Shows mapping the java 7 way.
 * 
 * @author Dan Wiechert
 */
public class Java7 {
    public static void main(final String[] args) {
        final List<Person> persons = ListMaker.createPersons();

        final List<Integer> nameLengths = new ArrayList<>(persons.size());
        for (final Person person : persons) {
            nameLengths.add(person.getName().length());
        }
        for (final int length : nameLengths) {
            System.out.println(length);
        }
    }
}
