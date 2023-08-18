class Apple{
    public void myMethod(){
        System.out.println("overridden Method");
    }
}
public class MethodOverridding extends Apple {
    @Override
    public void myMethod() {
        System.out.println("Overridding method");
    }
    public static void main(String[] args) {
        Apple obj1 = new Apple();
        obj1.myMethod();
        
        Apple obj = new MethodOverridding();
        obj.myMethod();
    }
    
}
