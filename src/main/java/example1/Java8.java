package example1;

import java.util.List;

import common.Person;
import common.ListMaker;

/**
 * Shows filtering the java 8 way.
 * 
 * @author Dan Wiechert
 */
public class Java8 {
	public static void main(final String[] args) {
		final List<Person> persons = ListMaker.createPersons();

		persons.parallelStream().filter(p -> p.getSex() == Person.Sex.MALE)
				.forEach(p -> System.out.println(p.getName()));
	}
}
