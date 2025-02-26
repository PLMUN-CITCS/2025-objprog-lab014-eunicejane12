public class MethodReturnTypes {

    // Void method: Displays a welcome message, does not return any value
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    // Method with return type 'double' to calculate the average of two numbers
    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;  // Calculate the average
        return average;  // Return the average
    }

    public static void main(String[] args) {
        // Call the displayWelcomeMessage method to display the welcome message
        displayWelcomeMessage();

        // Declare variables
        int value1 = 20;
        int value2 = 30;

        // Call calculateAverage and store the returned value in result
        double result = calculateAverage(value1, value2);

        // Print the result
        System.out.println("The average is: " + result);
    }
}
