import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class Places {

    // Create object of list using ArrayList
    static List<String> places = new ArrayList<>();

    // Prepare data
    public static List getPlaces(){

        // Add places and country to the list
        places.add("London, England");
        places.add("Glasgow, Scotland");
        places.add("Cardiff, Wales");
        places.add("Belfast, Northern Ireland");
        places.add("Dublin, Ireland");
        places.add("Paris, France");
        places.add("Madrid, Spain");
        places.add("Rome, Italy");
        places.add("Kathmandu, Nepal");
        places.add("New Delhi, India");
        places.add("Washington DC, United States of America");
        places.add("Abuja, Nigeria");

        return places;
    }
    

    public static void main( String[] args ) {

        List<String> myPlaces = getPlaces();
        System.out.println("Please enter the Country you would like to know the capital city of:");
        
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine(); // Stores the input from the console to this variable 
        
        if (a.equalsIgnoreCase("Nepal")) {
        // Filter places from Nepal
        myPlaces.stream()
                .filter((p) -> p.startsWith("Nepal"))
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));
    
        }
    }
}