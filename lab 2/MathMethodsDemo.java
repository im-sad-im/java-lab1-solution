public class MathMethodsDemo {
    public static void main(String[] args) {
        // Method 1: Math.abs() - Absolute value
        int num1 = -42;
        double num2 = -3.14;

        int absInt = Math.abs(num1);
        double absDouble = Math.abs(num2);

        System.out.println("Absolute value of " + num1 + " is " + absInt);
        System.out.println("Absolute value of " + num2 + " is " + absDouble);

        // Method 2: Math.sqrt() - Square root
        double squareRoot = Math.sqrt(64.0);
        System.out.println("Square root of 64 is " + squareRoot);

        // Method 3: Math.pow() - Exponentiation
        double base = 2.0;
        double exponent = 3.0;
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);

        // Method 4: Math.max() - Maximum value
        int maxInt = Math.max(25, 37);
        double maxDouble = Math.max(3.14, 2.71);
        System.out.println("Maximum value is " + maxInt);
        System.out.println("Maximum value is " + maxDouble);

        // Method 5: Math.min() - Minimum value
        int minInt = Math.min(15, 8);
        double minDouble = Math.min(0.1, 0.01);
        System.out.println("Minimum value is " + minInt);
        System.out.println("Minimum value is " + minDouble);
    }
}

