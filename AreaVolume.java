public class AreaVolume {
    public static void main(String[] args) {
        double length = 20;
        double width  = 10;
        double height = 5;
        double area = calculateArea(length, width);
        double volume = calculateVolume(length, width, height);

        System.out.println("Area of rectangle : " + area);
        System.out.println("Volume of rectangle : " + volume);
    }

public static double calculateArea( double length, double width) {
    return length * width;
}
public static double calculateVolume( double length, double width, double height ) {
    return length * width * height;
}
}
