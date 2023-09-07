public class ControlStatement {
    public static void main(String[] args) {
        // Selection Statement (if-else)
        int num = 15;
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        // Iteration Statement (for loop)
        System.out.println("\nPrinting sum of numbers from 1 to 5 using a for loop:");
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.print("sum  " +  sum);
        // Jump Statement (break)
        System.out.println("\n\nBreaking the loop at 3 using the break statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exit the loop when i is 3
            }
            System.out.print(i + " ");
        }
        // Jump Statement (continue)
        System.out.println("\n\nSkipping printing of 3 using the continue statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; 
            }
            System.out.print(i + " ");
        }
        // Jump Statement (return)
        System.out.println("\n\nUsing the return statement to exit the method:");
        int result = multiply(5, 7);
        System.out.println("Result: " + result);
    }
    // Method to demonstrate return statement
    public static int multiply(int a, int b) {
        return a * b;
    }
}
