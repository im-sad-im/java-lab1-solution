package mathpackage;

public class MainClass {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 15;

        int sum = MathOperations.add(num1, num2);
        int difference = MathOperations.subtract(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
