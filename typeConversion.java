public class typeConversion {
    public static void main(String[] args) {
        // Implicit (Automatic) Type Conversion
         int numInt = 100;
        long numLong = numInt; 
        float numFloat = numLong; 
        double numDouble = numFloat; 

        System.out.println("Implicit Type Conversion:");
        System.out.println("int to long: " + numLong);
        System.out.println("long to float: " + numFloat);
        System.out.println("float to double: " + numDouble);

        // Explicit (Manually) Type Conversion
        double doubleValue = 123.456;
        int intFromDouble = (int) doubleValue; 

        long longValue = 387658324;
        int intFromLong = (int) longValue; 

        float floatVal = 456.789f;
        int intFromFloat = (int) floatVal; 

        System.out.println("\nExplicit Type Conversion (Casting):");
        System.out.println("double to int: " + intFromDouble);
        System.out.println("long to int: " + intFromLong);
        System.out.println("float to int: " + intFromFloat);
    }
}
