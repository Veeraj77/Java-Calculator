import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        Calculator calculator = new Calculator();

        // Get user input for operation choice
        int choice = input.choices();

        // Switch case for operations
        switch (choice) {
            case 1:
                System.out.println("Result: " + calculator.addition());
                break;
            case 2:
                System.out.println("Result: " + calculator.subtraction());
                break;
            case 3:
                System.out.println("Result: " + calculator.multiplication());
                break;
            case 4:
                System.out.println("Result: " + calculator.division());
                break;
            case 5:
                calculator.fibonacci(); 
                break;
            case 6:
                int[] arrayForSum = input.inputArray();  
                System.out.println("Sum of Array: " + calculator.sumOfArray(arrayForSum));
                break;
            case 7:
                int[] arrayForMean = input.inputArray();  
                System.out.println("Mean of Array: " + calculator.meanOfArray(arrayForMean));
                break;
            case 8:
                System.out.println("Exit.");
                break;
            default:
                System.out.println("Invalid choice! Please choose a valid option.");
        }
    }
}