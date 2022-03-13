Data classes:

Learn about classes, properties and data classes and then rewrite the following Java code to Kotlin:
public class Person {
    private final String name;
    private final int age;
​
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
​
    public String getName() {
        return name;
    }
​
    public int getAge() {
        return age;
    }
}
Afterward, add the data modifier to the resulting class. The compiler will generate a few useful methods for this class: equals/hashCode, toString, and some others.
