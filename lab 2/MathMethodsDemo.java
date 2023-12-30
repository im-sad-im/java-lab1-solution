public class MathMethodsDemo {
    public static void main(String[] args) {
        // Example values for demonstration
        double x = 9.75;
        double y = -4.5;

        // Square root
        double sqrtResult = Math.sqrt(x);
        System.out.println("Square root of " + x + " is: " + sqrtResult);

        // Power (x^2)
        double powResult = Math.pow(x, 2);
        System.out.println(x + " raised to the power of 2 is: " + powResult);

        // Absolute value
        double absResultX = Math.abs(x);
        double absResultY = Math.abs(y);
        System.out.println("Absolute value of " + x + " is: " + absResultX);
        System.out.println("Absolute value of " + y + " is: " + absResultY);

        //Random number generator
        double randomResult = ( Math.random() *100);
        System.out.println("Random number between 0.0 (inclusive) and 1.0 (exclusive): " + randomResult);
        
        // Floor (largest integer less than or equal to x)
        double floorResultX = Math.floor(x);
        double floorResultY = Math.floor(y);
        System.out.println("Floor of " + x + " is: " + floorResultX);
        System.out.println("Floor of " + y + " is: " + floorResultY);
    }
}

