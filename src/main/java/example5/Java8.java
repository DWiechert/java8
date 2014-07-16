package example5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import common.ListMaker;
import common.Person;

/**
 * Shows collecting the java 8 way.
 * 
 * @author Dan Wiechert
 */
public class Java8 {
    public static void main(final String[] args) {
        final List<Person> persons = ListMaker.createPersons();
        
        // Collecting the names of the persons into a list
        // Could also do a specific type of list with .collect(Collectors.toCollection(LinkedList::new));
        final List<String> names = persons.stream().map(p -> p.getName()).collect(Collectors.toList());
        names.forEach(n -> System.out.println(n));
        
        // Collecting the names into a string joined by ','
        System.out.println();
        final String joinedNames = names.stream().collect(Collectors.joining(","));
        System.out.println(joinedNames);

        // Grouping the persons into a map based on their sex
        System.out.println();
        final Map<Person.Sex, List<Person>> sexGroups = persons.stream().collect(Collectors.groupingBy(Person::getSex));
        sexGroups.forEach((s, list) -> System.out.println("Sex: " + s + "\tPersons: " + list));
        
        // Partitioning the persons based on if their names starts with 'P'
        System.out.println();
        final Map<Boolean, List<Person>> namePartitions = persons.stream().collect(Collectors.partitioningBy(p -> p.getName().startsWith("P")));
        namePartitions.forEach((n, list) -> System.out.println("Name starts with 'P': " + n + "\tPersons: " + list));
    }
}
