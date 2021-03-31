## Routine Data Manipulation

We have different methods within the collections framework to manipulate data with:
- `reverse()` - reverses order of elements;
- `fill()` - replace every element in a collection with specified value;
- `copy()` - creates a copy of elements from specified source to destination;
- `swap()` - swaps position of two elements in a collection; and
- `addAll()` - adds all elements of a collection to another collection.

Example
```java
import java.util.Collections;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        System.out.println("ArrayList1: " + numbers);

        // Using reverse()
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList1: " + numbers);

        // Using swap()
        Collections.swap(numbers, 0, 1);
        System.out.println("ArrayList1 using swap(): " + numbers);

        ArrayList<Integer> newNumbers = new ArrayList<>();

        // Using addAll
        newNumbers.addAll(numbers);
        System.out.println("ArrayList2 using addAll(): " + newNumbers);

        // Using fill()
        Collections.fill(numbers, 0);
        System.out.println("ArrayList1 using fill(): " + numbers);

        // Using copy()
        Collections.copy(newNumbers, numbers);
        System.out.println("ArrayList2 using copy(): " + newNumbers);
    }
}
```
Outputs:
```shell
ArrayList1: [1, 2]
Reversed ArrayList1: [2, 1]
ArrayList1 Using swap(): [1, 2]
ArrayList2 using addALl(): [1, 2]
ArrayList1 using fill(): [0, 0]
ArrayList2 using copy(): [0, 0]
```
Note that, when using the `copy()` method, both lists should be of the same size.