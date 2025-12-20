package LambdaExpAndStreams.Lambda.MethodReferences.TypesOfMethodRefs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ConstructorMethodReference {
    // Get List of objects of given
    // length and Supplier
    public static <T> List<T>
    getObjectList(int length,
                  Supplier<T> objectSupply)
    {
        List<T> list = new ArrayList<>();

        for (int i = 0; i < length; i++)
            list.add(objectSupply.get());
        return list;
    }

    public static void main(String[] args)
    {

        List<Person3> personList
                = getObjectList(5, Person3::new);

        // Print names of personList
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);
    }
}
