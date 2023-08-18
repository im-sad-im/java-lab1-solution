class Outer {
    private int outerData = 10;

    void outerMethod() {
        System.out.println("Outer Method");
    }

    class Inner {
        // private int innerData = 20;

        void innerMethod() {
            System.out.println("Inner Method");
            System.out.println("Accessing outerData from Inner: " + outerData);
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();

        Outer.Inner inner = outer.new Inner();
        inner.innerMethod();
    }
}
