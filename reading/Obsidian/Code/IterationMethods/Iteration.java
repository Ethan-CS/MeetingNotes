import java.util.ArrayList;
import java.util.Iterator;

class Iteration {
    
    public static void main(String[] args) {
        //Creating ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers);
        
        //Creating an instance of Iterator
        Iterator<Integer> iterate = numbers.iterator();
        
        //using the next() method from Iterator framework
        int number = iterate.next();
        System.out.println("Removed Element: " + number);
        
        System.out.print("Updated ArrayList: ");
        
        //Using the hasNext() method
        while(iterate.hasNext()) {
            //Using the forEachRemaining() method
            iterate.forEachRemaining((value) -> System.out.print(value + " , "));
            //Lambda Expression!
        }
    }
}