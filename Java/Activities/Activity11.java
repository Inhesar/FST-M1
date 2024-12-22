package daytwo;
import java.util.HashMap;
import java.util.Map;

public class Activity11 {
		public static void main(String[] args) {
		        Map<Integer, String> colours = new HashMap<>();

		        colours.put(1, "Red");
		        colours.put(2, "Blue");
		        colours.put(3, "Green");
		        colours.put(4, "Yellow");
		        colours.put(5, "Purple");

		        System.out.println("Initial Map of colours: " + colours);

		        colours.remove(3);
		        boolean containsGreen = colours.containsValue("Green");
		        System.out.println("Does the Map contain 'Green'? " + containsGreen);
		        System.out.println("Size of the Map after removal: " + colours.size());
		    }
		}
