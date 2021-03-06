package example1;

import java.util.List;

import common.ListMaker;
import common.Person;

/**
 * Shows how to implement interfaces the java 8 way.
 *
 * @author Dan Wiechert
 */
public class Java8 {
    public static void main(final String[] args) {
        final List<Person> persons = ListMaker.createPersons();

        persons.forEach(p -> {
            final Runnable runnable = () -> {
                // We can add multiple lines within a lambda expression with the curly brackets '{}'
                // Though they're not truly needed for this example so it could've been just:
                // final Runnable runnable = () -> System.out.println(p.getName());
                System.out.println(p.getName());
            };
            runnable.run();
        });
    }
}
