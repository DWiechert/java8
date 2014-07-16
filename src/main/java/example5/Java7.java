package example5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import common.ListMaker;
import common.Person;

/**
 * Shows collecting the java 7 way.
 * 
 * @author Dan Wiechert
 */
public class Java7 {
    public static void main(final String[] args) {
        final List<Person> persons = ListMaker.createPersons();

        // Collecting the names of the persons into a list
        final List<String> names = new ArrayList<>();
        for (final Person person : persons) {
            names.add(person.getName());
        }
        for (final String name : names) {
            System.out.println(name);
        }

        // Collecting the names into a string joined by ','
        System.out.println();
        final StringBuilder builder = new StringBuilder();
        for (final Person person : persons) {
            builder.append(person.getName()).append(',');
        }
        System.out.println(builder.toString().substring(0, builder.toString().lastIndexOf(',')));

        // Grouping the persons into a map based on their sex
        System.out.println();
        final Map<Person.Sex, List<Person>> sexGroups = new HashMap<>();
        final List<Person> males = new ArrayList<>();
        final List<Person> females = new ArrayList<>();
        for (final Person person : persons) {
            if (person.getSex() == Person.Sex.MALE) {
                males.add(person);
            } else {
                females.add(person);
            }
        }
        sexGroups.put(Person.Sex.FEMALE, females);
        sexGroups.put(Person.Sex.MALE, males);
        for (final Map.Entry<Person.Sex, List<Person>> entry : sexGroups.entrySet()) {
            System.out.println("Sex: " + entry.getKey() + "\tPersons: " + entry.getValue());
        }

        // Partitioning the persons based on if their names starts with 'P'
        System.out.println();
        final Map<Boolean, List<Person>> namePartitions = new HashMap<>();
        final List<Person> truths = new ArrayList<>();
        final List<Person> falses = new ArrayList<>();
        for (final Person person : persons) {
            if (person.getName().startsWith("P")) {
                truths.add(person);
            } else {
                falses.add(person);
            }
        }
        namePartitions.put(Boolean.FALSE, falses);
        namePartitions.put(Boolean.TRUE, truths);
        for (final Map.Entry<Boolean, List<Person>> entry : namePartitions.entrySet()) {
            System.out.println("Name starts with 'P': " + entry.getKey() + "\tPersons: " + entry.getValue());
        }
    }
}
