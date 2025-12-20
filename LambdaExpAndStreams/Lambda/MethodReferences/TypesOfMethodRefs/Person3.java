package LambdaExpAndStreams.Lambda.MethodReferences.TypesOfMethodRefs;

import java.util.Random;

public class Person3 {

    private String name;
    private Integer age;

    // Constructor
    public Person3() {
        Random ran = new Random();

        // Assigning a random value
        // to name
        this.name
                = ran
                .ints(97, 122 + 1)
                .limit(7)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

    public Integer getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}