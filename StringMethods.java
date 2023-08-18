public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String str1 = "Game";
        
        // Length method
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // Substring method
        // String substring = str.substring(7);
        // System.out.println("Substring from index 7: " + substring);
        
        // Uppercase method
        String uppercase = str.toUpperCase();
        System.out.println("Uppercase: " + uppercase);
        
        // Lowercase method
        String lowercase = str.toLowerCase();
        System.out.println("Lowercase: " + lowercase);
        
        // Replace method
        // String replaced = str.replace("Hello", "Hi");
        // System.out.println("After replace: " + replaced);
        //Concatenate method
        String concatenate = str.concat(str1);
        System.out.println("Concatenate: " + concatenate);
        //Compare method
        int compare = str1.compareTo(str);
        System.out.println(compare);


    }
}
