## Searching using `binarySearch()`

The `binarySearch()` method of Java collections framework searches for the specified element - it returns the position of the element in the specified collections.

Example:
```java
import java.util.Collections;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		// Creating an ArrayList
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		// Using binarySearch()
		int pos = Collections.binarySearch(numbers, 3);
		System.out.println("The position of 3 is: " + pos);
		}
	}
```

Output:
```shell
The position of 3 is 2
```

NB: the collection should be sorted before performing the `binarySearch()` method.

Counts from zero!

https://www.programiz.com/java-programming/binarysearch