package LambdaExpAndStreams.MethodReferences.TypesOfMethodRefs;

class Person2
{
    private  String name;
    private  Integer age;

    // Constructor
    public Person2(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() { return age; }
    public String getName() { return name; }
}