class Calculator {
    // for addition
    int addition() {
        UserInput input = new UserInput();
        int[] numbers = input.userInput();
        int sum = numbers[0] + numbers[1];
        System.out.println("The sum is: " + sum);
        return sum;
    }

    // for subtraction
    int subtraction() {
        UserInput input = new UserInput();
        int[] numbers = input.userInput();
        int sub = numbers[0] - numbers[1];
        System.out.println("The subtraction is: " + sub);
        return sub;
    }

    // for multiplication
    int multiplication() {
        UserInput input = new UserInput();
        int[] numbers = input.userInput();
        int product = numbers[0] * numbers[1];
        System.out.println("The multiplication is: " + product);
        return product;
    }

    // for division
    int division() {
        UserInput input = new UserInput();
        int[] numbers = input.userInput();
        
        // Handle division by zero
        if (numbers[1] == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        
        int quotient = numbers[0] / numbers[1];
        System.out.println("The division is: " + quotient);
        return quotient;
    }

    // Fibonacci series
    void fibonacci() {
        UserInput input = new UserInput();
        int size = input.fibonacci();  // Corrected method call for size input
        int first = 0, second = 1;
        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < size; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    // Sum of an array
    int sumOfArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Mean of an array
    double meanOfArray(int[] array) {
        return (double) sumOfArray(array) / array.length;
    }
}