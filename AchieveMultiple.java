// Interface 1
interface A {
    void methodA();
}

// Interface 2
interface B {
    void methodB();
}

// Class implementing both interfaces A and B
class MyClass implements A, B {
    @Override
    public void methodA() {
        System.out.println("Method from interface A");
    }
    @Override
    public void methodB() {
        System.out.println("Method from interface B");
    }
}

public class AchieveMultiple {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}
