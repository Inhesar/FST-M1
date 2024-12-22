package daytwo;
import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		import java.util.HashSet;

//		public class Main {
//		    public static void main(String[] args) {
		        HashSet<String> hs = new HashSet<>();

		        hs.add("Apple");
		        hs.add("Banana");
		        hs.add("Orange");
		        hs.add("Mango");
		        hs.add("Grapes");
		        hs.add("Peach");

		        System.out.println("Size of the HashSet: " + hs.size());
		        hs.remove("Mango");
		        System.out.println("After removing 'Mango', size of the HashSet: " + hs.size());
		        boolean removed = hs.remove("Pineapple");
		        if (!removed) {
		            System.out.println("'Pineapple' was not found in the HashSet.");
		        }

		        boolean containsBanana = hs.contains("Banana");
		        System.out.println("Does the HashSet contain 'Banana'? " + containsBanana);

		        System.out.println("Updated HashSet: " + hs);
		    }
		}
