public class StringCreation {
    public static void main(String[] args) {
        // Creating strings using string literals
        String str1 = "Hello, World!";
        String str2 = "Hello, " + "World!";
        // Creating strings using the new keyword
        String str3 = new String("Hello, World!");
        // Displaying the strings
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

        // Checking if str1 and str2 refer to the same object
        System.out.println("str1 == str2: " + (str1 == str2));

        // Checking if str1 and str3 refer to the same object
        System.out.println("str1 == str3: " + (str1 == str3));

        // Checking if the contents of str1 and str3 are the same
        System.out.println("str1.equals(str3): " + str1.equals(str3));
    }
}
