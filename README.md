Data classes:

Learn about classes, properties and data classes and then rewrite the following Java code to Kotlin:

public class Person {

    private final String name;
    
    private final int age;
    
public Person(String name, int age) {
        
        this.name = name;
        
        this.age = age;
    }
    
public String getName() {
        return name;
    }

public int getAge() {
        return age;
    }
}

Afterward, add the data modifier to the resulting class. The compiler will generate a few useful methods for this class: equals/hashCode, toString, and some others.
___________________________________________________________________________________________________________________________________________________________________


Smart casts

Rewrite the following Java code using smart casts and the when expression:

public int eval(Expr expr) {
    
    if (expr instanceof Num) {
        return ((Num) expr).getValue();
    }
    
    if (expr instanceof Sum) {
        Sum sum = (Sum) expr;
        return eval(sum.getLeft()) + eval(sum.getRight());
    }
    
    throw new IllegalArgumentException("Unknown expression");
}

___________________________________________________________________________________________________________________________________________________________________

Sealed classes

Reuse your solution from the previous task, but replace the interface with the sealed interface. Then you no longer need the else branch in when.
