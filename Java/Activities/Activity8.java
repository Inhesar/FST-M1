package daytwo;

//public class Activity8 {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CustomException Class: Extends Exception
		class CustomException extends Exception {
		    // Private variable to hold the exception message
		    private String message;

		    // Constructor to initialize the message
		    public CustomException(String message) {
		        this.message = message;
		    }

		    // Override getMessage() to return the custom message
		    @Override
		    public String getMessage() {
		        return this.message;
		    }
		}

		// Main Class
		public class Main {
		    // Method to test exception handling
		    public static void exceptionTest(String str) throws CustomException {
		        if (str == null) {
		            throw new CustomException("Custom Error: String cannot be null");
		        } else {
		            System.out.println("The string is: " + str);
		        }
		    }

		    public static void main(String[] args) {
		        // Test with a non-null string
		        try {
		            exceptionTest("Hello, World!");
		        } catch (CustomException e) {
		            System.out.println(e.getMessage());
		        }

		        // Test with a null string to trigger the exception
		        try {
		            exceptionTest(null);
		        } catch (CustomException e) {
		            System.out.println(e.getMessage());
		        }
		    }
		

}
