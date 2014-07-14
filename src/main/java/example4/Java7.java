package example4;

import java.util.List;

import common.ListMaker;
import common.Person;

/**
 * Shows how to implement interfaces the java 7 way.
 * 
 * @author Dan Wiechert
 */
public class Java7 {
    public static void main(final String[] args) {
        final List<Person> persons = ListMaker.createPersons();

        for (final Person person : persons) {
            final Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println(person.getName());
                }
            };
            runnable.run();
        }
    }
}
