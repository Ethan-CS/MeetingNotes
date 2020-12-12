## Shuffling using shuffle()

The `shuffle()` method of the Java collections framework is used to destroy any order present in a data structure. This is often used in games where we want a random output.

```java
import java.util.ArrayList;
import java.util.Collections;

class Shuffle {
    public static void main(String[] args) {
        
        //Creating array list
        ArrayList<Integer> numbers = new ArrayList<>();
        
        //Add elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Sorted ArrayList: " + numbers);
        
        //Using the shuffle() method:
        Collections.shuffle(numbers);
        System.out.println("ArrayList using shuffle: " + numbers);
    }
}
```

