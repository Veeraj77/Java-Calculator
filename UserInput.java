import java.util.Scanner;
class UserInput {

    // User input for basic arithmetic operations
    int[] userInput() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];
        System.out.println("Enter the first number: ");
        numbers[0] = sc.nextInt();
        System.out.println("Enter the second number: ");
        numbers[1] = sc.nextInt();
        return numbers;
    }

    // Choice for operation
    int choices() {
        Scanner sca = new Scanner(System.in);
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");
        System.out.println("5. FIBONACCI SERIES");
        System.out.println("6. SUM OF ARRAY");
        System.out.println("7. MEAN OF ARRAY");
        System.out.println("8. Exit");
        return sca.nextInt();
    }

    // Number of terms for Fibonacci 
    int fibonacci() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series: ");
        return scan.nextInt();
    }

    // Input array from user
    int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int size = sc.nextInt();  
        
        int[] array = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }
}