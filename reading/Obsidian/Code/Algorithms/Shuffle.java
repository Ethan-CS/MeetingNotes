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