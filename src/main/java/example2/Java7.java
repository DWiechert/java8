package example2;

import java.util.List;

import common.ListMaker;
import common.Person;

/**
 * Shows filtering the java 7 way.
 *
 * @author Dan Wiechert
 */
public class Java7 {
    public static void main(final String[] args) {
        final List<Person> persons = ListMaker.createPersons();

        for (final Person person : persons) {
            if (person.getSex() == Person.Sex.MALE) {
                System.out.println(person.getName());
            }
        }
    }
}
