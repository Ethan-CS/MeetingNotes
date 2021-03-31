## Sort() method

The `sort()` method in the collections framework is used to order elements.

```java
import java.util.ArrayList;
import java.util.Collections;

class Sort {
	public static void main(String[] args) {
	
	//Creating an array list
	ArrayList<Integer> numbers = new ArrayList<>();
	
	//Add elements
	numbers.add(4);
	numbers.add(2);
	numbers.add(3);
	System.out.println("Unsorted ArrayList: " + numbers);
	
	//Using sort() method
	Collections.sort(numbers);
	System.out.println("Sorted ArrayList: " + numbers);

	}
}
```
The output is:
```shell
Unsorted ArrayList: [4, 2, 3]
Sorted ArrayList: [2, 3, 4]
```