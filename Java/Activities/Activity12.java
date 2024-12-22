package daytwo;
@FunctionalInterface
interface Addable {
    int add(int num1, int num2);
}
public class Activity12 {

	public static void main(String[] args) {
		        Addable ad1 = (num1, num2) -> num1 + num2;
		        Addable ad2 = (num1, num2) -> {
		            int result = num1 + num2;
		            return result;
		        };

		        int result1 = ad1.add(5, 3); // Uses ad1, adds 5 + 3
		        int result2 = ad2.add(10, 20); // Uses ad2, adds 10 + 20

		        System.out.println("Result of ad1 (no body lambda): " + result1);
		        System.out.println("Result of ad2 (lambda with body): " + result2);
		    }}