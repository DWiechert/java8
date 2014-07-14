package example5;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import common.ListMaker;
import common.Person;

/**
 * Shows comparing the java 7 way.
 * 
 * @author Dan Wiechert
 */
public class Java7 {
    public static void main(final String[] args) {
        final List<Person> persons = ListMaker.createPersons();
        persons.addAll(ListMaker.createPersons2());

        Collections.sort(persons, new PersonComparator());
        
        for (final Person person : persons) {
            System.out.println(person);
        }
    }

    private static class PersonComparator implements Comparator<Person> {
        public PersonComparator() {
        }

        @Override
        public int compare(final Person p1, final Person p2) {
            final int nameCompare = p1.getName().compareTo(p2.getName());
            if (nameCompare != 0) {
                return nameCompare;
            }
            
            final int sexCompare = p1.getSex().compareTo(p2.getSex());
            if (sexCompare != 0) {
                return sexCompare;
            }
            
            return p1.getEmail().compareTo(p2.getEmail());
        }
    }
}
