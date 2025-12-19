package LambdaExpAndStreams.MethodReferences.TypesOfMethodRefs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticMethodRef {

    // Static method to compare with name
    public static int compareByName(Person2 a, Person2 b)	{
        return a.getName().compareTo(b.getName());
    }

    // Static method to compare with age
    public static int compareByAge(Person2 a, Person2 b) {
        return a.getAge().compareTo(b.getAge());
    }

    public static void main(String[] args) {

        List<Person2> personList = new ArrayList<>();

        personList.add(new Person2("Vicky", 24));
        personList.add(new Person2("Poonam", 25));
        personList.add(new Person2("Sachin", 19));

        Collections.sort(personList, StaticMethodRef::compareByName);

        // Display message only
        System.out.println("Sort by Name :");

        // Using streams over above object of Person type
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

        System.out.println();

        // Now using static method reference
        // to sort array by age
        Collections.sort(personList, StaticMethodRef::compareByAge);

        // Display message only
        System.out.println("Sort by Age :");

        // Using streams over above object of Person type
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);
    }
}
