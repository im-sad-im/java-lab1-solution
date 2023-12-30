public class BoxingUnboxing {
    public static void main(String[] args) {
        // Boxing: Converting primitive to wrapper class
        int primitiveInt = 42;
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Boxing

        // Unboxing: Converting wrapper class to primitive
        double primitiveDouble = wrapperInt.doubleValue(); // Unboxing

        // Autoboxing: Automatically converting primitive to wrapper class
        char primitiveChar = 'A';
        Character wrapperChar = primitiveChar; // Autoboxing

        // Autounboxing: Automatically converting wrapper class to primitive
        // float primitiveFloat = wrapperChar.floatValue(); // Autounboxing

        // Display results
        System.out.println("Original primitive int: " + primitiveInt);
        System.out.println("Boxed Integer: " + wrapperInt);
        System.out.println("Unboxed double: " + primitiveDouble);
        System.out.println("Original primitive char: " + primitiveChar);
        System.out.println("Autoboxed Character: " + wrapperChar);
        // System.out.println("Autounboxed float: " + primitiveFloat);
    }
}
