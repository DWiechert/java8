package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMaker {
    public static List<Person> createPersons() {
        final List<Person> persons = new ArrayList<>();

        final Person person1 = new Person();
        person1.setSex(Person.Sex.MALE);
        person1.setName("Name1");
        person1.setEmail("Email1");
        persons.add(person1);

        final Person person2 = new Person();
        person2.setSex(Person.Sex.MALE);
        person2.setName("PersonName2");
        person2.setEmail("PersonEmail2");
        persons.add(person2);

        final Person person3 = new Person();
        person3.setSex(Person.Sex.FEMALE);
        person3.setName("Name3");
        person3.setEmail("Email3");
        persons.add(person3);

        final Person person4 = new Person();
        person4.setSex(Person.Sex.FEMALE);
        person4.setName("PersonName4");
        person4.setEmail("PersonEmail4");
        persons.add(person4);

        return persons;
    }

    public static List<Person> createPersons2() {
        final List<Person> persons = new ArrayList<>();

        final Person person1 = new Person();
        person1.setSex(Person.Sex.FEMALE);
        person1.setName("Name1");
        person1.setEmail("Email12");
        persons.add(person1);

        final Person person2 = new Person();
        person2.setSex(Person.Sex.MALE);
        person2.setName("PersonName2");
        person2.setEmail("PersonEmail22");
        persons.add(person2);

        final Person person3 = new Person();
        person3.setSex(Person.Sex.MALE);
        person3.setName("Name3");
        person3.setEmail("Email32");
        persons.add(person3);

        final Person person4 = new Person();
        person4.setSex(Person.Sex.FEMALE);
        person4.setName("PersonName4");
        person4.setEmail("PersonEmail42");
        persons.add(person4);

        return persons;
    }

    public static List<Integer> createNumbers() {
        return Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });
    }
}
