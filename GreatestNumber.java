public class GreatestNumber {
    public static void main(String[] args) {
        int a = 20;
        int b = 50;
        int c = 40;
        if (a > b && a > c)
            System.out.println("Greatest Number is a = " + a);
        else if (b > a && b > c)
            System.out.println("Greatest Number is b = " + b);
        else if (c > a && c > b)
            System.out.println("Greatest Number is c = " + c);
        else
            System.out.println("Either two or all number are equal");
    }
}