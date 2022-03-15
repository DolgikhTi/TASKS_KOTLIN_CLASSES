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

Smart casts:

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

Sealed classes:

Reuse your solution from the previous task, but replace the interface with the sealed interface. Then you no longer need the else branch in when.
___________________________________________________________________________________________________________________________________________________________________

Rename on import:

When you import a class or a function, you can specify a different name for it by adding as NewName after the import directive. It can be useful if you want to use two classes or functions with similar names from different libraries.
Uncomment the code and make it compile. Rename Random from the kotlin package to KRandom, and Random from the java package to JRandom.
___________________________________________________________________________________________________________________________________________________________________

Extension functions:

Learn about extension functions. Then implement the extension functions Int.r() and Pair.r() and make them convert Int and Pair to a RationalNumber.
Pair is a class defined in the standard library:

data class Pair<out A, out B>(
    
    val first: A,
    val second: B
)
